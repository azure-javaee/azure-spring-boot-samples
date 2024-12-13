## Samples for `Simplify Java on Azure Deployment`

This repository holds sample project that used to test the features of SJAD. Please refer to 
[private preview guidance for new Java features in azd](https://microsoft.github.io/SJAD)
to see how to test it.


## Sample list

- [ ] mysql
  - [ ] spring-cloud-azure-starter-jdbc-mysql
    - [ ] [spring-cloud-azure-mysql-sample](mysql/spring-cloud-azure-starter-jdbc-mysql/spring-cloud-azure-mysql-sample)
      - [ ] Auth by userAssignedManagedIdentity (@rujche: ❌ Validation failed with error like this: `Caused by: java.sql.SQLException: Access denied for user 'aad_springCloudAzureMysqlSampleMysql'@'xx.xxx.xxx.xxx' (using password: NO)`)
      - [x] Auth by password (@rujche: validated ✅)
    - [x] [spring-petclinic](./mysql/spring-cloud-azure-starter-jdbc-mysql/spring-petclinic)
      - [x] Auth by userAssignedManagedIdentity (@rujche: validated ✅)
      - [x] Auth by password (@rujche: validated ✅)

- [ ] postgresql
  - [ ] spring-cloud-azure-starter-jdbc-postgresql
    - [ ] [spring-cloud-azure-postgresql-sample](./postgresql/spring-cloud-azure-starter-jdbc-postgresql/spring-cloud-azure-postgresql-sample) 
      - [ ] Auth by userAssignedManagedIdentity (@rujche: ❌ Validation failed with error like this: `The access token does not have a valid audience claim. Please acquire a new token for the resource "https://ossrdbms-aad.database.windows.net".`)
      - [x] Auth by password (@rujche: validated ✅)
    - [x] [spring-petclinic](./postgresql/spring-cloud-azure-starter-jdbc-postgresql/spring-petclinic)
      - [x] Auth by userAssignedManagedIdentity (@rujche: validated ✅)
      - [x] Auth by password (@rujche: validated ✅)

- [x] mongo
  - [x] [todo-java-mongo-aca](./mongo/todo-java-mongo-aca) (@rujche: validated ✅)

- [x] cosmos
  - [x] [cosmos-sample](./cosmos/cosmos-sample) (@rujche: validated ✅)

- [x] redis
  - [x] [redis-sample](./redis/redis-sample) (@saragluna: validated ✅)

- [x] eventhubs
  - [x] [eventhubs-sample](./eventhubs/eventhubs-sample)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: validated ✅)
    - [x] Auth by connectionString (@haozhan:  validated ✅)
  - [x] [kafka-sample](./eventhubs/kafka-sample)
    - [x] Auth by userAssignedManagedIdentity (@haozhan:  validated ✅)
    - [x] Auth by connectionString (@haozhan:  validated ✅)
  - [x] [spring-cloud-azure-eventhubs-starter](./eventhubs/spring-cloud-azure-starter-eventhubs/eventhubs-client)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation ❌)
    - [x] Auth by connectionString (@haozhan: Validation ❌)
  - [x] [spring-messaging-azure-eventhubs](./eventhubs/spring-messaging-azure-eventhubs/eventhubs-spring-messaging)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation ❌)
    - [x] Auth by connectionString (@haozhan: Validation ❌)
  - [x] [spring-cloud-azure-starter-integration-eventhubs](./eventhubs/spring-cloud-azure-starter-integration-eventhubs/eventhubs-integration)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: )
    - [x] Auth by connectionString (@haozhan: )
  - [x] [spring-cloud-azure-stream-binder-eventhubs](./eventhubs/spring-cloud-azure-stream-binder-eventhubs/eventhubs-binder)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation ❌)
    - [x] Auth by connectionString (@haozhan: Validation ❌)
  - [x] [spring-cloud-azure-stream-binder-eventhubs-multi-spring3](./eventhubs/spring-cloud-azure-stream-binder-eventhubs/eventhubs-multibinders/spring3sample)
    - [x] Auth by userAssignedManagedIdentity (@haozhan:)
    - [x] Auth by connectionString (@haozhan:)
  - [x] [spring-cloud-azure-stream-binder-eventhubs-multi-spring2](./eventhubs/spring-cloud-azure-stream-binder-eventhubs/eventhubs-multibinders/spring2sample)
    - [x] Auth by userAssignedManagedIdentity (@haozhan:)
    - [x] Auth by connectionString (@haozhan:)
  - [x] [spring-kafka](./eventhubs/spring-cloud-azure-starter-integration-eventhubs/eventhubs-integration)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: )
    - [x] Auth by connectionString (@haozhan: )
  - [x] [spring-cloud-stream-binder-kafka](./eventhubs/spring-cloud-azure-stream-binder-eventhubs/eventhubs-binder)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation ❌)
    - [x] Auth by connectionString (@haozhan: Validation ❌)

- [x] servicebus
  - [x] IsJMS = false
    - [x] [lower-case-to-upper-case-sample](./servicebus/lower-case-to-upper-case-sample)
      - [x] Auth by userAssignedManagedIdentity (@saragluna: validated ✅)
      - [x] Auth by connectionString (@saragluna: validated ✅)
  - [x] IsJMS = true
    - [x] [servicebus-jms-queue](./servicebus/servicebus-jms-queue)
      - [x] Auth by userAssignedManagedIdentity (@saragluna: validated ✅)
      - [x] Auth by connectionString (@saragluna: validated ✅)
    - [x] [servicebus-jms-topic](./servicebus/servicebus-jms-topic)
      - [x] Auth by userAssignedManagedIdentity (@saragluna: validated ✅)
      - [x] Auth by connectionString (@saragluna: validated ✅)
