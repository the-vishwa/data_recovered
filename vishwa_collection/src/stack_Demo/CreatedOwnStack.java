package stack_Demo;

import java.util.Stack;

public class CreatedOwnStack {
public static void main(String[] args) {
	Stack<String> stk = new Stack<>();
	stk.push("vishwa"); 	//insert 1st 			 removed last     index 4
	stk.push("nirmal");	//insert 2	nd		 removed 3rd     index 3
	stk.push("kuldip");	//insert 3	rd			 removed 2nd    index 2
	stk.push("premjit");	//insert last      	 removed  1st    index 1
	
	System.out.println(stk.size());
	
//	int i =stk.search("premjit");
//	 System.out.println(i);
	
//	System.out.println("----------");
	
	System.out.println(stk.search("vishwa"));
	
                          	System.out.println(stk);
	
	 String str =  stk.pop();   
	 System.out.println(str);
	 System.out.println(stk);
	 
	 String str1 = stk.peek();
	 System.out.println(str1);
	 System.out.println(stk);
	 
//	 int i =stk.search("nirmal");
//	 System.out.println(i);
	 
	 
	 //boolean b = stk.isEmpty();
	 System.out.println(stk.isEmpty()); // pass b or .....
	 
}
}
