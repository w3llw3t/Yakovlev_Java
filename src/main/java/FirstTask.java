import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) { // Бесконечный цикл
            try {
                System.out.print("Введите число: ");
                double i = scanner.nextDouble();

                if (i > 7) {
                    System.out.println("Привет");
                    break; // Выход из цикла, так как введены корректные данные
                } else {
                    System.out.println("Число должно быть больше 7. Пожалуйста, введите еще раз.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите корректное число.");
                scanner.nextLine(); // Очищаем буфер ввода
            }
        }

        scanner.close();
    }
}