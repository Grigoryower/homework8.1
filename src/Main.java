import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }

    public static void leapYear(int year) {
        System.out.println("Задание 1");

        boolean leapYear = false;
        if (year % 4 == 0) {
            leapYear = true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leapYear = true;
                else
                    leapYear = false;
            }
        } else
            leapYear = false;
        if (!leapYear)
            System.out.println(year + " : год — невисокосный год");
        else
            System.out.println(year + " : год — високосный год");
    }

    public static void task1() {
        leapYear(2017);

    }

    public static void clientDeviceYear(int currentYear,int clientOS) {
        if (currentYear < 2015 &&clientOS == 0 ) {
        System.out.printf("Установите новую версию приложения для Ois\n");}
            else if (clientOS == 0 && currentYear >= 2015 ) {
          System.out.printf(" Установите облегченную версию приложения для Ois\n");
            }
         else if (currentYear >= 2015 && clientOS == 1) {
                System.out.printf("Установите облегченную версию приложения для Android \n");}
             else if (clientOS == 1 && currentYear < 2015 ) {
              System.out.printf("Установите новую версию приложения для Android\n");
           }
    }
    public static void task2() {
        System.out.println("Задание 2");
        clientDeviceYear(2015, 1);

    }

    public static String deliveryDistanceDays(int deliveryDistance) {
        int day= 1;
        if (deliveryDistance <= 20) {
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            day++;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            day= day + 2;

        } else if (deliveryDistance > 100){
           return ("Свыше 100 км доставки нет ");
        }
        return "Займет  дней на доставку "  + day;
    }
    public static void task3() {
        System.out.println("Задание 3");
        System.out.println( deliveryDistanceDays(61));
    }
}