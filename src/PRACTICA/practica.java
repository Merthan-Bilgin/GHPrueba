package PRACTICA;

import java.util.Scanner;

public class practica {

	public static void main(String[] args) {
		
		//int[] sumArray = {4,36,4,23,867};
		int[] subArray = {785675, 56, 5675, 56544, 234};
		int[] prodArray = {6, 8, 20, 23, 12};
		
		// User 1 fer la suma dels elements de sumArray
		
		int[] sumArray = {4,36,4,23,867};
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < sumArray.length; i++) {
			System.out.println("Dame numeros: ");
			sumArray[i] = scan.nextInt();
		}
		
		for (int i = 0; i < sumArray.length; i++) {
			total = total + sumArray[i];
		}
		
		System.out.println("El total es: " + total);
		
		
		// User 2 fer la resta dels elements de subArray
		
		
		
		// User 3 fer la multiplicació dels elements de prodArray
		
	}

}
