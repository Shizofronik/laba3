package lz3;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = in.nextLine();
        in.close();

        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true; // Слово из 1 или 0 символов — палиндром
        }
        // Сравниваем первую и последнюю буквы
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false; // Если они разные, это не палиндром
        }
        // Если 1я и последняя буква равны, то мы их убираем и сраниваем 2ю и предпоследнюю и.т.д
        return isPalindrome(str.substring(1, str.length() - 1));
    }

}
