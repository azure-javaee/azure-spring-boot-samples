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

- [x] postgres
   - [x] spring-cloud-azure-starter-jdbc-postgresql
     - [x] spring-cloud-azure-postgresql-sample 
       - [ ] Auth by userAssignedManagedIdentity (@rujche: Validation failed with error like this: `The access token does not have a valid audience claim. Please acquire a new token for the resource "https://ossrdbms-aad.database.windows.net".`)
       - [x] Auth by password (@rujche: Validation passed)
  
- [ ] eventhubs (@haozhan is working on it)
- [ ] servicebus (@saragluna is working on it)


