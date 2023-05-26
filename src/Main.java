import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.09." + year);
        } else {
            System.out.println("13.09." + year);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0){
            if (year % 100 == 0){
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}