###Задача №1 - "Менеджер Товаров"

На основании проекта из лекции необходимо реализовать менеджер товаров, который умеет:

* Добавлять товары в репозиторий
* Искать товары (репозиторий должен отдать все товары, а менеджер уже потом по ним ищет)

#### Что нужно сделать:

1) Разработайте базовый класс Product, содержащий id, название, стоимость
2) Разработать два унаследованных от Product класса: Book (с полями название* и автор) и Smartphone (с полями название* и производитель)
3) Разработайте репозиторий, позволяющий сохранять Product'ы, получать все сохранённые Product'ы и удалять по id
4) Разработайте менеджера, который умеет добавлять Product'ы в репозиторий и осуществлять поиск по ним

##### Требования к проекту:

1. Создайте ветку (не делайте ДЗ в master!)
2. Подключите плагин Surefire так, чтобы сборка падала в случае отсутсвия тестов
3. Подключите плагин JaCoCo в режиме генерации отчётов (обрушать сборку по покрытию не нужно)
4. Реализуйте нужные классы и методы
5. Напишите автотесты на метод поиска (только на метод поиска в менеджере), добившись 100% покрытия по branch'ам* (вспомните, что мы говорили про тестирование методов, возвращающих набор значений)
6. Подключите CI на базе Github Actions и выложите всё на Github
