package package1;

public class MyStacks {
	
	int[] stack;
	int top = 0;
	int MAX;
	
	public myStacks (int size) {
		this.top = 0;
		this.stack = new int [size];
		
	}
	
	//char[] stack = {};
	char stack[] = new char [10];
	stack = new char[MAX];
	//MAX = 10;
	//top = ;
	
	public char pop(){  //elimina el ultimo valor
		
		if(top == 0){
		System.out.println("Stack is empty");
		return ();
		
		} else {
			top ; /* decreases top */
			return(); /*returns eliminated element*/
			}
	}
	
	public char push(){
		
	}
}
