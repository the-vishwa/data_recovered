package archana_khaire.info;

public class pattern14 {
	public static void main(String[] args) {
		int n =10;
		for(int r=1; r<=n; r++) {
			
			for(int s=1;s<=n-r; s++) {
				
				System.out.print("  ");
			}
			for(int c =1; c<=r;c++) {
				System.out.print(" *  ");
			}
			System.out.println();
		}
	}

}
