import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        int value = scanner.nextInt();
        int factorial = 1;

        for (int i = 2; i <= value; i++) {
            factorial *=i;
        }

        System.out.println("Факториал числа " + value + " равен " + factorial);

    }
}
