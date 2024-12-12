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
      - [x] Auth by userAssignedManagedIdentity (@rujche: Validation passed)
      - [x] Auth by password (@rujche: Validation passed)

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

- [x] eventhubs (@haozhan is working on it)
  - [x] [eventhubs-sample](./eventhubs/eventhubs-sample)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation passed)
    - [x] Auth by connectionString (@haozhan: Validation passed)
  - [x] [kafka-sample](./eventhubs/kafka-sample)
    - [x] Auth by userAssignedManagedIdentity (@haozhan: Validation passed)
    - [x] Auth by connectionString (@haozhan: Validation passed)

- [x] servicebus (@saragluna is working on it)
  - [x] IsJMS = false
    - [x] [lower-case-to-upper-case-sample](./servicebus/lower-case-to-upper-case-sample)
      - [x] Auth by userAssignedManagedIdentity
      - [x] Auth by connectionString
  - [x] IsJMS = true
    - [x] [todo-java-mongo-aca](./servicebus/todo-java-mongo-aca)
      - [x] Auth by userAssignedManagedIdentity
      - [x] Auth by connectionString
