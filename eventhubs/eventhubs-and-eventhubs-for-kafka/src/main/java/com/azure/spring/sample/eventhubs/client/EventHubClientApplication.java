// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.sample.eventhubs.client;

import com.azure.core.util.IterableStream;
import com.azure.messaging.eventhubs.EventData;
import com.azure.messaging.eventhubs.EventHubConsumerClient;
import com.azure.messaging.eventhubs.EventHubProducerClient;
import com.azure.messaging.eventhubs.models.EventPosition;
import com.azure.messaging.eventhubs.models.PartitionEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/**
 * Sample for EventHubConsumerClient and EventHubProducerClient usage.
 */
@SpringBootApplication
public class EventHubClientApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventHubClientApplication.class);

    @Autowired
    private EventHubConsumerClient consumerClient;

    @Autowired
    private EventHubProducerClient producerClient;

    public static void main(String[] args) {
        SpringApplication.run(EventHubClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Sending message using Event Hub producer client. ==> {}", producerClient.getEventHubName());
        producerClient.send(Arrays.asList(new EventData("Hello World, EventHubs")));
        LOGGER.info("Sent message to Event Hub.");
        producerClient.close();

        TimeUnit.SECONDS.sleep(3);
        LOGGER.info("Receiving message using Event Hub consumer client. ==> {}", consumerClient.getEventHubName());
        String PARTITION_ID = "0";
        IterableStream<PartitionEvent> partitionEvents = consumerClient.receiveFromPartition(PARTITION_ID, 1,
            EventPosition.earliest());
        Iterator<PartitionEvent> iterator = partitionEvents.stream().iterator();
        if (iterator.hasNext()) {
            PartitionEvent pe = iterator.next();
            LOGGER.info("Received message: {}", pe.getData().getBodyAsString());
        } else {
            LOGGER.error("Failed to receive message.");
        }

        TimeUnit.SECONDS.sleep(15);
        kafkaTemplate.send(EVENT_HUB_NAME, "Hello World, Kafka!");
        LOGGER.info("Message was sent successfully. " + EVENT_HUB_NAME);
    }

    private final KafkaTemplate<String, String> kafkaTemplate;

    public EventHubClientApplication(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    private static final String EVENT_HUB_NAME = "eh1";
    private static final String CONSUMER_GROUP = "$Default";

    @KafkaListener(topics = EVENT_HUB_NAME, groupId = CONSUMER_GROUP)
    public void receive(String message) {
        LOGGER.info("New message received: {}", message);
    }

}
