package archana_khaire.info;

public class waterimage {
	public static void main(String[] args) {
		int n =10;
		 for(int i=1; i<=n; i++) {
			  for(int j=1; j<=n-i; j++) {
				  System.out.print(" ");
			  }
			  for(int s =1; s<=i;s++) {
				  System.out.print(" * ");
			  }
			  System.out.println();
			  if(i==n-1) {
				  break;
			  }
		 }
	







     //new program
       for(int i=n; i>=1;i--) {
    	   for(int j=1; j<=n-i; j++) { 
    	   System.out.print(" ");
    	   }
    	   for(int s=1;s<=i;s++) {
    		   System.out.print(" * ");
    	   }
    	   System.out.println();
       }
	} 
}	

   
