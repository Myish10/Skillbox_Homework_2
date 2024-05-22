import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = new Random().nextInt(101);
        System.out.println("Угадай число от 0 до 100 :)");

        while (true) {
            int attempt = scanner.nextInt();
            if (attempt == value) {
                System.out.println("Ты угадал! Я загадал число " + value);
                break;
            } else if (attempt > value) {
                System.out.println("Загаданное число меньше. Попробуй угадать еще раз!");
            } else {
                System.out.println("Загаданное число больше. Попробуй угадать еще раз!");
            }
        }

    }
}
