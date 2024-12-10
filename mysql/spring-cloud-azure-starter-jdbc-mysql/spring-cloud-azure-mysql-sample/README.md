# Verify This Sample 

## Create a new "todo" item in the database.

Update the host of Azure Container Apps in the following command, then execute it:
```shell
curl --header "Content-Type: application/json" \
    --request POST \
    --data '{"description":"configuration","details":"congratulations, you have set up JDBC correctly!","done": "true"}' \
    https://spring-cloud-azure-mysql-sampl.xxx.azurecontainerapps.io
```

## Retrieve the data by using a new cURL request as follows.  
Update the host of Azure Container Apps in the following command, then execute it:
```shell
curl https://spring-cloud-azure-mysql-sampl.xxx.azurecontainerapps.io
```

Will return the list of "todo" items, including the item you've created, as follows: 

```json
[{"id":1,"description":"configuration","details":"congratulations, you have set up correctly!","done":true}]
```
