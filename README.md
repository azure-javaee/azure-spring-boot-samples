## Samples for `Simplify Java on Azure Deployment`

This repository holds sample project that used to test the features of SJAD. Please refer to 
[private preview guidance for new Java features in azd](https://microsoft.github.io/SJAD)
to see how to test it.


## Sample list

- [ ] mysql
  - [ ] spring-cloud-azure-starter-jdbc-mysql
    - [ ] [spring-cloud-azure-mysql-sample](mysql/spring-cloud-azure-starter-jdbc-mysql/spring-cloud-azure-mysql-sample)
      - [ ] Auth by userAssignedManagedIdentity (@rujche: Validation failed with error like this: `Caused by: java.sql.SQLException: Access denied for user 'aad_springCloudAzureMysqlSampleMysql'@'xx.xxx.xxx.xxx' (using password: NO)`)
      - [x] Auth by password (@rujche: Validation passed)
    - [x] [spring-petclinic](./mysql/spring-cloud-azure-starter-jdbc-mysql/spring-petclinic)
      - [x] Auth by userAssignedManagedIdentity (@rujche is validating this case.)
      - [x] Auth by password (@rujche is validating this case.)

- [ ] postgresql
  - [ ] spring-cloud-azure-starter-jdbc-postgresql
    - [ ] [spring-cloud-azure-postgresql-sample](./postgresql/spring-cloud-azure-starter-jdbc-postgresql/spring-cloud-azure-postgresql-sample) 
      - [ ] Auth by userAssignedManagedIdentity (@rujche: Validation failed with error like this: `The access token does not have a valid audience claim. Please acquire a new token for the resource "https://ossrdbms-aad.database.windows.net".`)
      - [x] Auth by password (@rujche: Validation passed)
    - [x] [spring-petclinic](./postgresql/spring-cloud-azure-starter-jdbc-postgresql/spring-petclinic)
      - [x] Auth by userAssignedManagedIdentity (@rujche is validating this case.)
      - [x] Auth by password (@rujche is validating this case.)

- [x] mongo
  - [x] [todo-java-mongo-aca](./mongo/todo-java-mongo-aca)

- [x] cosmos
  - [x] [cosmos-sample](./cosmos/cosmos-sample)

- [x] redis
  - [x] [redis-sample](./redis/redis-sample)

- [ ] eventhubs (@haozhan is working on it)
  - [x] [eventhubs-sample](./eventhubs/eventhubs-sample)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation passed)
    - [x] Auth by connectionString (@haozhan: Validation passed)
  - [x] [kafka-sample](./eventhubs/kafka-sample)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation passed)
    - [x] Auth by connectionString (@haozhan: Validation passed)
  - [x] [spring-cloud-azure-eventhubs-starter](./eventhubs/spring-cloud-azure-starter-eventhubs/eventhubs-client)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation failed)
    - [x] Auth by connectionString (@haozhan: Validation failed)
  - [x] [spring-messaging-azure-eventhubs](./eventhubs/spring-messaging-azure-eventhubs/eventhubs-spring-messaging)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation failed)
    - [x] Auth by connectionString (@haozhan: Validation failed)
  - [x] [spring-cloud-azure-starter-integration-eventhubs](./eventhubs/spring-cloud-azure-starter-integration-eventhubs/eventhubs-integration)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: )
    - [x] Auth by connectionString (@haozhan: )
  - [x] [spring-cloud-azure-stream-binder-eventhubs](./eventhubs/spring-cloud-azure-stream-binder-eventhubs/eventhubs-binder)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation failed)
    - [x] Auth by connectionString (@haozhan: Validation failed)
  - [x] [spring-cloud-azure-stream-binder-eventhubs-multi-spring3](./eventhubs/spring-cloud-azure-stream-binder-eventhubs/eventhubs-multibinders/spring3sample)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation failed)
    - [x] Auth by connectionString (@haozhan: Validation failed)
  - [x] [spring-cloud-azure-stream-binder-eventhubs-multi-spring2](./eventhubs/spring-cloud-azure-stream-binder-eventhubs/eventhubs-multibinders/spring2sample)
    - [x] Auth by userAssignedManagedIdentity (@haozhan:)
    - [x] Auth by connectionString (@haozhan:)
  - [x] [spring-kafka](./eventhubs/spring-cloud-azure-starter-integration-eventhubs/eventhubs-integration)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: )
    - [x] Auth by connectionString (@haozhan: )
  - [x] [spring-cloud-stream-binder-kafka](./eventhubs/spring-cloud-azure-stream-binder-eventhubs/eventhubs-binder)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation failed)
    - [x] Auth by connectionString (@haozhan: Validation failed)

- [ ] servicebus (@saragluna is working on it)
  - [ ] IsJMS = false
    - [x] [lower-case-to-upper-case-sample](./servicebus/lower-case-to-upper-case-sample)
      - [x] Auth by userAssignedManagedIdentity
      - [x] Auth by connectionString
  - [ ] IsJMS = true
    - [x] [todo-java-mongo-aca](./servicebus/todo-java-mongo-aca)
      - [x] Auth by userAssignedManagedIdentity
      - [x] Auth by connectionString
