import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public Map<String, String> map = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    public void add() {
        System.out.println("Создание нового контакта!");
        System.out.println("Введите номер телефона:");
        String phone = scan.nextLine();
        System.out.println("Введите ФИО контакта:");
        String name = scan.nextLine();
        map.put(phone, name);
        System.out.println("Контакт добавлен!");
    }

    public void del() {
        System.out.println("Удаление контакта!");
        System.out.println("Введите номер тедефона контакта, которое необходимо удалить:");
        String phone = scan.nextLine();
        if (map.containsKey(phone)) {
            map.remove(phone);
            System.out.println("Контакт удален!");
        } else {
            System.out.println("Контакт не найден!");
        }
    }

    public void find() {
        System.out.println("Поиск контакта!");
        System.out.println("Введите номер телефона или ФИО контакта: ");
        String input = scan.nextLine();        
        if (map.containsKey(input) || map.containsValue(input) ) {             
            for (Map.Entry <String, String> entry : map.entrySet()) { 
                if (input.equals(entry.getValue()) || input.equals(entry.getKey())) {                           
                    System.out.println("Найден контакт: " + entry.getValue() + " - номер телефона: " + entry.getKey());
                }
            }             
        }else {
            System.out.println("Контакт не найден!");
        }
    }
    public void show() {
        int count = 1;
        for (Map.Entry <String, String> entry : map.entrySet()) {
            System.out.println("[" + count + "] " + entry.getValue() + " - " + entry.getKey());
            count++;
        }
    }
}