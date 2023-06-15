import java.util.Scanner;

public class CycleHomeWork {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        } // First Exercise

        for(int i = 5; i >= 1; i--) {
            System.out.println(i);
        } // Second Exercise

        for(int i = 1; i <= 10; i++) {
            System.out.println("3*" + i + "=" + 3*i);
        } // Third exercise

        System.out.print("Введите любое натуральное и положительное число: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum); // Last exercise

    }
}
