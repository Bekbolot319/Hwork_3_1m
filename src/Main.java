import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double [] numbers = {3.3, 11.1, -14.9, 5.7, -71.33, -5.4, 7.99,
        1.5, -2.65, 17.2, 21.0, -33.8, 13,6, 14.8, 16.7
        };
        boolean firstNegativeFound = false;
        double total = 0;
        int count = 0;

        for (double num : numbers) {
            if (firstNegativeFound && num > 0) {
                System.out.println();
                total += num;
                count++;
            }
            if (num < 0) {
                firstNegativeFound = true;
            }
        }

        if (count > 0) {
            double average = total / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: " + average);
        } else {
            System.out.println("Положительных чисел после первого отрицательного числа не найдено.");
        }










    }
}