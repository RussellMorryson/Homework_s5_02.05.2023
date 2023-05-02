/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
что 1 человек может иметь несколько телефонов.*/
import java.util.Scanner;

public class Task_1 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        PhoneBook map = new PhoneBook();
        boolean work = true;
        while(work) {
            System.out.println("Выберите пункт меню:");
            System.out.println("[1] - Добавить новый контакт");
            System.out.println("[2] - Удалить контакт");
            System.out.println("[3] - Найти контакт");
            System.out.println("[4] - Вывести весь список контактов");
            System.out.println("[0] - Выход");
            int change = scan.nextInt();
            if (change == 1) {
                map.add();            
            } else if (change == 2) {                
                map.del();
            } else if (change == 3) {
                map.find();
            } else if (change == 4) {
                map.show();
            } else if (change == 0){
                System.out.println("Выход! \n");
                work = false;
            } else {
                System.out.println("Некорректный ввод");
            }
        }
        scan.close();
    }
}

