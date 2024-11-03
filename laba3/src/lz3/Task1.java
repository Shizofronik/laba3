package lz3;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	 public static void main(String[] args) {
		 
	        System.out.print("Введите длину массива: "); //Чуть чуть не по тз, но заранее прописывать элементы массива и число для удаления совсем уже как-то...
	        Scanner in = new Scanner(System.in); //Да, в это раз не лень))
	        int length = in.nextInt();
	        int[] numbers = new int[length];
	        
	        System.out.println("Введите элементы массива:");
	        for (int i = 0; i < length; i++) {
	        	numbers[i] = in.nextInt();
	        }
	        
	        System.out.println("Массив до удаления: " + Arrays.toString(numbers));
	        
	        System.out.print("Ваедите число для удаления: ");
	        int numToRemove = in.nextInt();
	        
	        in.close();
	        
	        int newSize = 0;
	        for (int num : numbers) {
	            if (num != numToRemove) {
	                newSize++;
	            }
	        }

	        int[] newArray = new int[newSize];
	        int index = 0;
	        for (int num : numbers) {
	            if (num != numToRemove) {
	                newArray[index++] = num;
	            }
	        }
	        
	        //Можно еще удалять элементы не создавая новый массив через ArraysList, но у меня сразу не заработало и я решил по простому
	        System.out.println("Массив после удаления: " + Arrays.toString(newArray)); 
	 }
}
