package Patil_Rushikesh;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		for(int r = 1 ; r <= 5 ;r++) {
			
			for(int j = 1 ; j <= r ;j++) {
				System.out.print("* ");
			}
			
		    System.out.println();	
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		for(int r=1; r <= 5;r++) {
			char ch='A';
			for(int j=1 ;j<=r ;j++) {
				System.out.print(ch+" ");
			}
			
			System.out.println();
			ch++;
		}
		
	}

}
