# Sending and Receiving Message by Azure Service Bus (Queue) And Jms in Spring Boot Application

This sample project demonstrates how to use Spring JMS for Azure Service Bus Queue via Spring Boot Starter `spring-cloud-azure-starter-servicebus-jms`.


## What You Will Build
You will build an application using Spring JMS to send and receive messages for Azure Service Bus Queue.

## Run with azd

```shell
azd init
azd up
```

## Run Locally

### Run the sample with Maven

In your terminal, run `mvn clean spring-boot:run`.

```shell
mvn clean spring-boot:run
```

### Run the sample in IDEs

You can debug your sample by adding the connection string of the Service Bus to the tool's environment variables or the sample's `application.yaml` file.

* If your tool is `IDEA`, please refer to [Debug your first Java application](https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html) and [add environment variables](https://www.jetbrains.com/help/objc/add-environment-variables-and-program-arguments.html#add-environment-variables).

* If your tool is `ECLIPSE`, please refer to [Debugging the Eclipse IDE for Java Developers](https://www.eclipse.org/community/eclipse_newsletter/2017/june/article1.php) and [Eclipse Environment Variable Setup](https://examples.javacodegeeks.com/desktop-java/ide/eclipse/eclipse-environment-variable-setup-example/).

## Verify This Sample


1. Send a POST request to service bus queue.
    ```
    curl -X POST http://localhost:8080/queue?message=hello 
    ```

2. Verify in your app's logs that a similar message was posted:
    ```
    Sending message
    ...
    Received message from queue: hello
    ```
