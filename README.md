### Для запуска тестов необходимо:

1. Запустить контейнеры командой `docker-compose up`.
2. Запустить приложение командой `java -jar artifacts/aqa-shop.jar`.
3. Запустить авто тесты командой `./gradlew clean test`.
4. Для создания отчета Allure запустить команду `./gradlew allureServe`.

### Переключение СУБД

### **1. MySQL**
https://github.com/asachiyigor/web_service_automation_project/blob/6564cea0e9cdbcf6e29891d9061545ae4d819e1b/application.properties#L9
[mysql_BdConnection](https://github.com/asachiyigor/web_service_automation_project/blob/c3de47677b730b674050a4a498279260923e64ae/src/test/java/ru/netology/data/DbInteraction.java#L17)
### **2. PostgreSQL**
https://github.com/asachiyigor/web_service_automation_project/blob/6564cea0e9cdbcf6e29891d9061545ae4d819e1b/application.properties#L4
[postgre_BdConnection](https://github.com/asachiyigor/web_service_automation_project/blob/c3de47677b730b674050a4a498279260923e64ae/src/test/java/ru/netology/data/DbInteraction.java#L18)

[![Build status](https://ci.appveyor.com/api/projects/status/fvubmutc0v7ncf37/branch/master?svg=true)](https://ci.appveyor.com/project/asachiyigor/web-service-automation-project/branch/master)