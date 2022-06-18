# План автоматизации тестирования

## Перечень автоматизируемых сценариев для оплаты путешествия по карте без использования кредитных средств.
<br />
<details>
<summary><b>Тестовые сценарии:</b></summary>

**1. Отправка валидной формы с именем на латинице (от 2-х символов)**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Успешно. Заявка отправлена!"

**2. Отправка формы с именем на кириллице (от 2-х символов)**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести данные в поле "Владелец" на кириллице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка. Неверный формат"


**3. Отправка пустой формы**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Поля не должны быть пустыми."

**4. Отправка формы c пустым полем "CVC/CVV"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Введите CVC/CVV код!"

**5. Отправка формы c пустым полем "Владелец"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "CVC/CVV".
7. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Введите Имя!"

**6. Отправка формы c пустым полем "Год"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
6. Ввести валидные данные в поле "CVC/CVV".
7. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Введите Год!"

**7. Отправка формы c пустым полем "Месяц"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести валидные данные в поле "Номер карты",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Введите Месяц!"

**8. Отправка формы с не валидными данными в поле "Номер карты"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести не валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Проверьте данные еще раз!"

**9. Отправка формы с не валидными данными в поле "CVC/CVV (2х значное число)"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести не валидные данные в поле "CVC/CVV" (2х значное число).
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Код CVC/CVV введен неверно!"

**10. Отправка формы с не валидными данными в поле "CVC/CVV ("000")"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести не валидные данные в поле "CVC/CVV" ("000").
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Код CVC/CVV введен неверно!"

**11. Отправка формы с не валидными данными в поле "Месяц"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести не валидные данные в поле "Месяц",
4. Ввести валидные данные в поле "Год",
5. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
6. Ввести валидные данные в поле "CVC/CVV".
7. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Проверьте данные еще раз!"

**12. Отправка формы с не валидными данными в поле "Год"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести не валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Проверьте данные еще раз!"

**13. Отправка формы с данными номера карты сгенерированными случайно**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести случайно сгенерированные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице(от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Проверьте данные еще раз!"

**14. Отправка формы с данными в поле имени владельца сгенерированными случайно**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести сгенерированные случайно данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Проверьте данные еще раз!"

</details>

## Перечень автоматизируемых сценариев для оплаты путешествия по карте c использованием кредитных средств.

<br />
<details>
<summary><b>Тестовые сценарии:</b></summary>

**1. Отправка валидной формы с именем на латинице (от 2-х символов)**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Успешно. Заявка отправлена!"

**2. Отправка формы с именем на кириллице (от 2-х символов)**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести данные в поле "Владелец" на кириллице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка. Неверный формат"



**3. Отправка пустой формы**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Поля не должны быть пустыми!"

**4. Отправка формы c пустым полем "CVC/CVV"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Введите CVC/CVV код!"

**5. Отправка формы c пустым полем "Владелец"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "CVC/CVV".
7. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Введите Имя!"

**6. Отправка формы c пустым полем "Год"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
6. Ввести валидные данные в поле "CVC/CVV".
7. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Введите Год!"

**7. Отправка формы c пустым полем "Месяц"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести валидные данные в поле "Номер карты",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Введите Месяц!"

**8. Отправка формы с не валидными данными в поле "Номер карты"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести не валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Проверьте данные еще раз!"

**9. Отправка формы с не валидными данными в поле "CVC/CVV" (2х значное число)**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести не валидные данные в поле "CVC/CVV" (2х значное число).
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Код CVC/CVV введен неверно!"

**10. Отправка формы с не валидными данными в поле "CVC/CVV ("000")"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести не валидные данные в поле "CVC/CVV" ("000").
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Код CVC/CVV введен неверно!"

**11. Отправка формы с не валидными данными в поле "Месяц"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести не валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Проверьте данные еще раз!"

**12. Отправка формы с не валидными данными в поле "Год"**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести не валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Проверьте данные еще раз!"

**13. Отправка формы с данными номера карты сгенерированными случайно**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести случайно сгенерированные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести валидные данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести не валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Проверьте данные еще раз!"

**14. Отправка формы с данными в поле имени владельца сгенерированными случайно**

*Шаги:*

1. Открыть сайт http://localhost:8080/,
2. Нажать кнопку "Купить в кредит",
3. Ввести валидные данные в поле "Номер карты",
4. Ввести валидные данные в поле "Месяц",
5. Ввести валидные данные в поле "Год",
6. Ввести сгенерированные случайно данные в поле "Владелец" на латинице (от 2-х символов),
7. Ввести валидные данные в поле "CVC/CVV".
8. Нажать на кнопку *"Продолжить"*.

*Ожидаемый результат:* Выведено сообщение "Ошибка! Проверьте данные еще раз!"
</details>

## Перечень используемых инструментов с обоснованием выбора

1. IntelliJ IDEA 2022.1.1 - удобная среда разработки для JAVA
2. Java 11 - оптимальная версия JDK
3. Gradle - удобная система автоматической сборки
4. Selenide - удобный и простой фреймфорк для написания авто-тестов
5. JUnit 5 - удобная среда тестирования для приложений Java
6. Docker ч\з docker compose - удобное ПО для работы с приложениями в средах с поддержкой контейнеризации.
7. Faker - инструмент для генерации тестовых данных.
8. Allure - автоматическое создание отчётов.
9. Драйверы MySQL, PostrgeSQL - необходимы для работы с базами данных из тестов.

## Перечень и описание возможных рисков при автоматизации

1. Существует риски пропустить критичные баги ввиду отсутствия минимальной документации и отсутствия возможности задать вопросы разработчикам.
2. Возможно частое изменение верстки (поведения) и селекторов страницы - поддержка займет много времени и потраченных средств
3. Можем пропустить баги в случае использования тестовых валидных данных и тестового доступа к БД
4. Попадаем в зависимость от инструментов тестирования


## Интервальная оценка с учётом рисков (в часах)

1. Планирование тестирования - 2 ч
2. Подготовка тестового окружения - 1 ч
3. Написание и прогоны авто-тестов - 8 часов;
4. Подготовка отчетов о проделанной работе - 1 час

Итого: 12 часов

### Для запуска тестов необходимо:

1. Запустить контейнеры командой `docker-compose up`.
2. Запустить приложение командой `java -jar artifacts/aqa-shop.jar`.
3. Запустить авто тесты командой `./gradlew clean test`.
4. Для создания отчета Allure запустить команду `./gradlew allureServe`.


## План сдачи работ (когда будут авто-тесты, результаты их прогона и отчёт по автоматизации):

1. Планирование тестирования - `17.06.2022`.
2. Подготовка тестового окружения - `17.06.2022`.
3. Написание и прогоны авто-тестов - `18.06.2022`.
4. Подготовка отчетов о проделанной работе - `18.06.2022`.

[![Build status](https://ci.appveyor.com/api/projects/status/vo67j68g0v118qr3/branch/master?svg=true)](https://ci.appveyor.com/project/asachiyigor/web-service-automation-project/branch/master)