package HomeWork5;

public class Program {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123-45-66");
        phoneBook.add("Федоров", "643-22-77");
        phoneBook.add("Сергеев", "789-98-55");
        phoneBook.add("Петров", "145-78-99");
        phoneBook.add("Сидоров", "987-66-55");
        phoneBook.get("Иванов");
        phoneBook.get("Сидоров");

    }
}