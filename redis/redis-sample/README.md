# Redis Sample Project

This is just a sample project that demonstrates the usage of redisTemplate in Spring Boot application.
After the application started, if you see log like this:
```text
Get value from redis: Value = 
```
It means the redis can be accessed successfully.

Don't worry if you see a web page of "Whitelabel Error Page". This page appeared because current application 
didn't prepare any web page. And add web dependency in current project is just avoid the Azure Container App restart
the application caused by health check.
