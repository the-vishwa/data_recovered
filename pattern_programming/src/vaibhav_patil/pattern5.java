package vaibhav_patil;

import java.util.Scanner;

public class pattern5 {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.println("Enter your number please");
		int r=sc.nextInt();
		
		for(int i=1;i<=r;i++) {
			
			for(int c=1;c<=i;c++) {
				
				System.out.print("* ");
			}
			
			
			System.out.println();
		}
	}

}
