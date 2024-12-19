## Samples for `Simplify Java on Azure Deployment`

This repository holds sample project that used to test the features of SJAD. Please refer to 
[private preview guidance for new Java features in azd](https://microsoft.github.io/SJAD)
to see how to test it.


## Sample list
- [spring petclinic microservice](https://github.com/azure-javaee/spring-petclinic-microservices/tree/sjad?tab=readme-ov-file#starting-services-with-azd)

- mysql
  - spring-cloud-azure-starter-jdbc-mysql
    - [spring-cloud-azure-mysql-sample](mysql/spring-cloud-azure-starter-jdbc-mysql/spring-cloud-azure-mysql-sample)
      - ❌ Auth by userAssignedManagedIdentity (@rujche: validation failed with error like this: `Caused by: java.sql.SQLException: Access denied for user 'aad_springCloudAzureMysqlSampleMysql'@'xx.xxx.xxx.xxx' (using password: NO)`)
      - ✅ Auth by password (@rujche: validated)
    - [spring-petclinic](./mysql/spring-cloud-azure-starter-jdbc-mysql/spring-petclinic)
      - ✅ Auth by userAssignedManagedIdentity (@rujche: validated)
      - ✅ Auth by password (@rujche: validated)

- postgresql
  - spring-cloud-azure-starter-jdbc-postgresql
    - [spring-cloud-azure-postgresql-sample](./postgresql/spring-cloud-azure-starter-jdbc-postgresql/spring-cloud-azure-postgresql-sample) 
      - ✅ Auth by userAssignedManagedIdentity (@rujche: validated)
      - ✅ Auth by password (@rujche: validated)
    - [spring-petclinic](./postgresql/spring-cloud-azure-starter-jdbc-postgresql/spring-petclinic)
      - ✅ Auth by userAssignedManagedIdentity (@rujche: validated)
      - ✅ Auth by password (@rujche: validated)

- mongo
  - ✅ [todo-java-mongo-aca](./mongo/todo-java-mongo-aca) (@rujche: validated)

- cosmos
  - ✅ [cosmos-sample](./cosmos/cosmos-sample) (@rujche: validated)

- redis
  - ✅ [redis-sample](./redis/redis-sample) (@saragluna: validated)

- eventhubs
  - spring-cloud-azure-stream-binder-eventhubs
    - [eventhubs-sample](./eventhubs/eventhubs-sample)
      - ✅ Auth by userAssignedManagedIdentity (@haozhan: validated)
      - ✅ Auth by connectionString (@haozhan: validated)
    - [spring-cloud-azure-stream-binder-eventhubs](./eventhubs/spring-cloud-azure-stream-binder-eventhubs/eventhubs-binder)
      - ❌ Auth by userAssignedManagedIdentity (@haozhan: validation failed, see readme)
      - ❌ Auth by connectionString (@haozhan: validation failed, see readme)
    - [spring-cloud-azure-stream-multi-binder-eventhubs-spring3](./eventhubs/spring-cloud-azure-stream-binder-eventhubs/eventhubs-multibinders/spring3sample)
      - ❌ Auth by userAssignedManagedIdentity (@haozhan: validation failed, see readme)
      - ❌ Auth by connectionString (@haozhan: validation failed, see readme)
    - [spring-cloud-azure-stream-multi-binder-eventhubs-spring2](./eventhubs/spring-cloud-azure-stream-binder-eventhubs/eventhubs-multibinders/spring2sample)
      - ❌ Auth by userAssignedManagedIdentity (@haozhan: validation failed, see readme)
      - ❌ Auth by connectionString (@haozhan: validation failed, see readme)
  - spring-cloud-starter-stream-kafka
    - [kafka-sample](./eventhubs/kafka-sample)
      - ✅ Auth by userAssignedManagedIdentity (@haozhan: validated)
      - ✅ Auth by connectionString (@haozhan:  validated)
    - [spring-cloud-stream-binder-kafka](./eventhubs/spring-cloud-azure-starter/spring-cloud-azure-sample-eventhubs-kafka)
      - ❌ Auth by userAssignedManagedIdentity (@haozhan: validation failed, see readme)
      - ❌ Auth by connectionString (@haozhan: validation failed, see readme)
  - spring-cloud-azure-starter-eventhubs
    - [spring-cloud-azure-eventhubs-starter](./eventhubs/spring-cloud-azure-starter-eventhubs/eventhubs-client)
      - ❌ Auth by userAssignedManagedIdentity (@haozhan: validation failed, see readme)
      - ❌ Auth by connectionString (@haozhan: validation failed, see readme)
  - spring-messaging-azure-eventhubs
    - [spring-messaging-azure-eventhubs](./eventhubs/spring-messaging-azure-eventhubs/eventhubs-spring-messaging)
      - ❌ Auth by userAssignedManagedIdentity (@haozhan: validation failed, see readme)
      - ❌ Auth by connectionString (@haozhan: validation failed, see readme)
  - spring-cloud-azure-starter-integration-eventhubs
    - [spring-cloud-azure-starter-integration-eventhubs](./eventhubs/spring-cloud-azure-starter-integration-eventhubs/eventhubs-integration)
      - ❌ Auth by userAssignedManagedIdentity (@haozhan: validation failed, see readme)
      - ❌ Auth by connectionString (@haozhan: validation failed, see readme)
  - spring-kafka
    - [spring-kafka-sample](./eventhubs/spring-kafka-sample)
      - ❌ Auth by userAssignedManagedIdentity (@haozhan: validation failed, see readme)
      - ❌ Auth by connectionString (@haozhan: validation failed, see readme)


- servicebus
  - IsJMS = false
    - [lower-case-to-upper-case-sample](./servicebus/lower-case-to-upper-case-sample)
      - ✅ Auth by userAssignedManagedIdentity (@saragluna: validated)
      - ✅ Auth by connectionString (@saragluna: validated)
  - IsJMS = true
    - [servicebus-jms-queue](./servicebus/servicebus-jms-queue)
      - ✅ Auth by userAssignedManagedIdentity (@saragluna: validated)
      - ✅ Auth by connectionString (@saragluna: validated)
    - [servicebus-jms-topic](./servicebus/servicebus-jms-topic)
      - ✅ Auth by userAssignedManagedIdentity (@saragluna: validated)
      - ✅ Auth by connectionString (@saragluna: validated)
     
- To verify
  - [ ] https://github.com/mkyong/spring-boot/tree/master/spring-data-jpa-postgresql
  - [ ] https://github.com/Azure-Samples/app-templates-java-openai-springapps
