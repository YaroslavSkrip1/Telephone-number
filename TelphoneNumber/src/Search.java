import java.util.Map;
import java.util.Scanner;

public class Search {
   static Scanner scanner = new Scanner(System.in);
   static boolean exit = false;
   static void searchLogic(){
        while (true) {
            try {
                int menu = scanner.nextInt();
                switch(menu) {
                    case 0: {
                        exit = true;
                        break;
                    }
                    case 1:{
                        System.out.println("Вы выбрали по номеру");
                        System.out.println("Введите номер телефоне абонента");
                        String n = scanner.next();
                        for (Map.Entry<String, String> entry : Init.abonent.entrySet()) {
                            if (entry.getKey().equals(n)) {
                                System.out.println(entry.getValue());
                            }
                        }
                        break;
                    }
                    case 2:{
                        System.out.println("Вы выбрали по фамилии");
                        System.out.println("Введите фамилию абонента");
                        String b = scanner.next();
                        for (Map.Entry<String, String> entry : Init.abonent.entrySet()) {
                            if (entry.getValue().equals(b)) {
                                System.out.println(entry.getKey());
                            }
                        }
                        break;
                    }
                    default: {
                        System.out.println("Введено неверное значение");
                    }
                }
                if (exit) {
                    System.out.println("You exit with program");
                    break;

                }
            }catch (Exception e) {
                System.out.println("Enter correct value 1 or 2");
                scanner.next();
            }
        }
    }
}