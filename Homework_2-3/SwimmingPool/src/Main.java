public class Main {
    public static void main(String[] args) {

        int volume = 1310;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int fullnessSwimmingPool = 0;
        int count = 0;

        while (fullnessSwimmingPool < volume) {
            fullnessSwimmingPool += fillingSpeed - devastationSpeed;
            count++;
        }

        System.out.printf("Время наполнения бассейна составит %d минут", count);

    }
}
