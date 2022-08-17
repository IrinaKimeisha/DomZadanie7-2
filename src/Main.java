public class Main {
    public static void main(String[] args) {
/** 1 Создать классы "Директор", "Рабочий", "Бухгалтер", "Человек". - ♥
 2 Класс человек сделать абстрактным, с полем хранящим должность. - ♥
 3 Выстроить правильную иерархию наследования. - ♥
 4 Реализовать интерфейс с методом, который печатает название должности и
 имплементировать этот метод в классы "Директор", "Рабочий", "Бухгалтер". - ♥
 5 Вывести в main должности директора, рабочего и бухгалтера.*/

        Director director = new Director();
        director.printJobTitle();
        Accountant accountant = new Accountant();
        accountant.printJobTitle();
        Worker worker = new Worker();
        worker.printJobTitle();

    }
}
