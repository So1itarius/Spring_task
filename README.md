# Spring_task
Небольшое spring-приложение, сохраняющие инфо в postgre db

# Запуск
нужно заполнить файл application.properties в папке resources, следующими строками:

>spring.datasource.url=jdbc:postgresql://yourhost:yourport/yourdb

>spring.datasource.username=yourlogin

>spring.datasource.password=yourpassword


# Описание

За основу взяты официальный HelloWord-овский гайд 

https://spring.io/guides/gs/serving-web-content/ для web части 

и два гайда 

https://spring.io/guides/gs/accessing-data-jpa/ ,

https://java-master.com/spring-boot-%D0%BF%D1%80%D0%B8%D0%BC%D0%B5%D1%80-%D1%81-postgres-%D0%B8-jpa/ 

для sql части

# UPD

Отобразил таблицу на страницу, добавил поля для обновления запиcи и удаления по id. 
