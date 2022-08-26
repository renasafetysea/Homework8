

public class Main {

    public static void main(String[] args) {
        printYearInfo();

    }
    private static void printYearInfo ( int year){
    boolean currentyear = yearInfo(year);
    printYearInfoResult(year,currentyear);

    }
    private static boolean yearInfo (int year) {
        return year % 4 == 0;

    }
    private static void printYearInfoResult (int year,boolean currentyear) {
        if (currentyear) {
            System.out.println(year + "Является высокосным");
        } else {
            System.out.println( year + " Не является высокосным");
        }
    }
}