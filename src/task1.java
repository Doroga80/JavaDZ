/*
 * task1
 * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
 */
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(n));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}





