import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        currentYear();
        versionYear();
        deliveryD();
    }
    public static void currentYear (){
        int year = LocalDate.now().getYear();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным");
        }
    }
    public static void versionYear(){
        int clientOS1 = 0;
        int clientDeviceYear;
        clientDeviceYear = LocalDate.now().getYear();

        if (clientOS1 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Утсановите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");

            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Утсановите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static int deliveryD(){
        int deliveryDistanse = 95;

        int deliveryDays = 1;

        if (deliveryDistanse > 20) {
            deliveryDays++;
        }
        if (deliveryDistanse > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней " + deliveryDays);

        return deliveryDistanse;
    }
}

