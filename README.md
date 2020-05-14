# Spring_task
Небольшое spring-приложение, сохраняющие инфо в postgre db

# Запуск
нужно создать файл application.properties в папке resources, со следующими строками:

>spring.datasource.url=jdbc:postgresql://localhost:yourport/yourdb

>spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true

>spring.datasource.platform=postgres

>spring.datasource.username=yourlogin

>spring.datasource.password=yourpassword

>spring.jpa.hibernate.ddl-auto=create

>spring.jpa.generate-ddl=true

>spring.data.jpa.repositories.enabled=true


# Описание

За основу взяты официальный HelloWord-овский гайд 

https://spring.io/guides/gs/serving-web-content/ для web части 

и два гайда 

https://spring.io/guides/gs/accessing-data-jpa/ ,

https://java-master.com/spring-boot-%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80-%D1%81-postgres-%D0%B8-jpa/ 

для sql части
