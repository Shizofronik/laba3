package lz3;

import java.util.Scanner;

//Тестом Ферма
public class Task3 {
    public static int nod(int a, int b) {
        if (b == 0)
            return a;
        return nod(b, a % b);
    }
    
    public static boolean ferma(int n) {
        if (n == 2)
            return true;
        
        for (int i = 0; i < 100; i++) {
            int a = ((int)(Math.random() * 1000) % (n - 2)) + 2;
    
            if (nod(a, n) != 1)
            return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
		System.out.println("Введите число");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		in.close();
		
		if (ferma(n)) {
            System.out.println("YES"); 
        }
        else System.out.println("NO");
		
		
		
	}
}