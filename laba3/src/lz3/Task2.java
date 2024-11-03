package lz3;
import java.lang.Math;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("Введите число");
		Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        in.close();
        double result = logFactorial(n);
        System.out.println("ln(" + n + "!): " + result);
    }

    public static double logFactorial(int n) {
        if (n <= 1) {
            return 0; 
        } else {
            return Math.log(n) + logFactorial(n - 1);
        }
    }
	
}
