# Localization
                                              Тестування локалізації сторінки оплати eCommerce
Отдельно тест для английского и отдельно для немецкого.

В файле Localization_EN.java в процессе работы сценария ввода реквизитов и перехода на следующую страницу, считываются
значения строк и сводятся в масив.

В файле  Excel_EN.java считаны соответствующие строки с excel и сводятся во второй масив.
Затем два массива сравниваються через  Assert.assertEquals(resultList_EN, expectedList_EN);

В процессе компиляции, путём вывода считаных строк с экрана и екселя видно какие строки успешно считаны с экрана а затем с екселя.
<br>Высвечивает ошибки в тех строках которые не совпадают с ожидаемыми значениями.</br>
<br>(Пример: 12 строка "E-Mail" и "E-mail" не совпадают)</br>

<b>Примечание:</b>
<br>Строки 7 и 8 не были найдены в екселе но считаны с екрана, т.к. их не с чем сравнивать они закоментированы.</br>
Строка 15 не считываеться, это кнопка Продолжить и она в процессе считки возвращает пустое значение поэтому она тоже закоментирована.

