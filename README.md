## Домашнее задание к занятию «4.1. Исключительные ситуации и их обработка. Тестирование исключений». 

### Задача №1 - NotFoundException
#### Что нужно сделать:

* Возьмите проект (мы его писали на одной из предыдущих лекций) с менеджером, репозиторием и товарами (Product, Book, TShirt)
* Создайте класс исключения NotFoundException отнаследовавшись от RuntimeException и реализуйте все конструкторы
* В методе удаления removeById сначала проверяйте, есть ли элемент (для этого прямо из метода removeById вызывайте метод findById: если результат - null, тогда выкидывайте исключение NotFoundException*)
* Напишите 2 автотеста на репозиторий: первый должен проверять успешность удаления существующего элемента, второй - генерации NotFoundException при попытке удаления несуществующего элемента

##### Итого: 
У вас должен быть репозиторий на GitHub, в котором расположен ваш Java-код и автотесты к нему..