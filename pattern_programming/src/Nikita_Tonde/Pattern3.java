package Nikita_Tonde;

public class Pattern3 {
	public static void main(String[]args) {
		char ch = 'A';
		for(int r = 1; r<=5; r++) {
			for (int c = 1;c<=r; c++) {
				System.out.print(ch+ " ");
				ch++;
				
			}
			System.out.println();
			
		}
		
		
		
	}
}
