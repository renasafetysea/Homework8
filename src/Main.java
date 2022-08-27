import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // задача 1
        printYearInfo(2025);
        // задача 2
        int clientOs = 0;
        int clientDeviceYear = 2020;
        getClientOsAndYear( clientOs, clientDeviceYear);

        // задача 3
        int deliveryDistanse = 95;
        System.out.println("Потребуется дней " + deliveryTime (deliveryDistanse));




    }
    private static void printYearInfo ( int year){
    boolean currentYear = yearInfo(year);
    printYearInfoResult(year,currentYear);
    }
    private static boolean yearInfo (int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 ==0;
    }
    private static void printYearInfoResult (int year,boolean currentYear) {
        if (currentYear) {
            System.out.println(year + "Является высокосным");
        } else {
            System.out.println( year + " Не является высокосным");
        }
    }
    private static void getClientOsAndYear( int clientOs, int clientDeviceYear)
    {
        int currentYear = LocalDate.now().getYear();
        if (clientOs == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    private static int deliveryTime (int deliveryDistanse) {
    int deliveryDays = 1;
    if (deliveryDistanse > 20) {
        deliveryDays++;
    }
        if (deliveryDistanse > 60) {
        deliveryDays++;
    }

        return deliveryDays;
}
}