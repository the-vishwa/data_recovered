package function;
interface View{
	void show();
}
public class Demo {
public static void main(String[] args) {
	View v = ()->{
		for (int i = 0; i <= 10; i = i + 2) {
			System.out.println(i);
		}
		
	};
	v.show();      // without method call
}
}
	
//Syntax error on token "show", Identifier expected after 
//this token
//- Syntax error, insert "Identifier (" to complete 
//MethodHeaderName
//- Syntax error, insert ")" to complete MethodDeclaration
//- Syntax error, insert ";" to complete MethodDeclaration