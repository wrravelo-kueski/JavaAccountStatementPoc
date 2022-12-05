# Java acccount statement POC

## Pre requisites

- Java 11
- Maven

## Properties file

Create src/main/resources/application.properties file with the following data

```properties
#datasource
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl

#hibernate ddl auto
spring.jpa.hibernate.ddl-auto=update
```

## Install dependencies

```bash
mvn install
```

## Run server

```bash
mvn spring-boot:run
```

## Run PDF task

```bash
mvn spring-boot:run -Dspring-boot.run.arguments="benchmark"
```