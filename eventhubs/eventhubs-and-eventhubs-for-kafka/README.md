
This sample is to test if the application can use the Event Hubs and Event Hubs for Kafka at the same time.

We use the `spring-cloud-azure-starter-eventhubs` and `spring-kafka` dependencies, the application can output normal logs.

Note that:
1. The event hub name should be same. If not, the application cannot bind multiple event hubs.
2. SJAD currently cannot make it work, because it configures different properties during `azd up`.