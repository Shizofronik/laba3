package lz3;
import java.util.Scanner;

public class Task5 {
	 public static int akkermann(int m, int n) {
		 	System.out.println("m: "+ m  + " n: "+ n);
	        if (m == 0) {
	            return n + 1;
	        }
	        
	        else if ((m > 0) && (n == 0)) {
	            return akkermann(m - 1, 1);
	        }
	        
	        else {
	            return akkermann(m - 1, akkermann(m, n - 1));
	        }
	    }    
	 
	    public static void main(String[] args) {
	        int m, n;
	        Scanner in = new Scanner(System.in);
	        do {
	            System.out.println("Введите неотрицательное число m: ");
	            m = in.nextInt();
	        } while (m < 0);
	        
	        do {
	            System.out.println("Введите неотрицательное число n: ");
	            n = in.nextInt();
	        } while (n < 0);
	        
	        in.close();
	        System.out.println(akkermann(m, n));
	    }

}
