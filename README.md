### Для запуска тестов необходимо:

1. Запустить контейнеры командой `docker-compose up`.
2. Запустить приложение командой `java -jar artifacts/aqa-shop.jar`.
3. Запустить авто тесты командой `./gradlew clean test`.
4. Для создания отчета Allure запустить команду `./gradlew allureServe`.

[![Build status](https://ci.appveyor.com/api/projects/status/vo67j68g0v118qr3/branch/master?svg=true)](https://ci.appveyor.com/project/asachiyigor/web-service-automation-project/branch/master)