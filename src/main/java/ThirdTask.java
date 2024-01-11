import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] num = new double[3];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.print("Элемент " + (i + 1) + ": ");
                num[i] = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите корректное число.");
                scanner.nextLine(); // Очищаем буфер ввода
                i--; // Уменьшаем счетчик, чтобы ввести значение еще раз
            }
        }

        // Вывод элементов, кратных 3
        System.out.println("Элементы массива, кратные 3:");
        for (double element : num) {
            if (element % 3 == 0) {
                System.out.println(element);
            }
        }

        scanner.close();
    }
}