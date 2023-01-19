package stack_queue;

import java.util.Stack;

public class CreatedOwnStack {
public static void main(String[] args) {
	Stack<String> stk = new Stack<>();
	stk.push("vishwa"); 	//insert 1st 			 removed last     index 4
	stk.push("nirmal");	//insert 2	nd		 removed 3rd     index 2
	stk.push("kuldip");	//insert 3	rd			 removed 2nd    index 1
	stk.push("premjit");	//insert last      	 removed  1st    index 0
                          	System.out.println(stk);
	
	 String str =  stk.pop();   
	 System.out.println(str);
	 System.out.println(stk);
	 
	 String str1 = stk.peek();
	 System.out.println(str1);
	 System.out.println(stk);
	 
	 int i =stk.search("nirmal");
	 System.out.println(i);
	 
	 
	 //boolean b = stk.isEmpty();
	 System.out.println(stk.isEmpty()); // pass b or .....
	 
}
}
