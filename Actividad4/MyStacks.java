package package1;

public class MyStacks {
	
	    private char[] stack;
	    private int top;
	    private int MAX;

	    public MyStacks(int size) {
	        MAX = size;
	        stack = new char[MAX];
	        top = -1;
	    }
	
	    public void push(char item) {
	    	 if (top < MAX - 1) {
	             stack[++top] = item;
	         } else {
	             System.out.println("El stack esta lleno");
	         }
	     }
	
	    public char pop(){
	    	 if (top >= 0) {
	             return stack[top--];
	         } else {
	             System.out.println("El stack esta vacio");
	             return '#'; 
	         }
	     }
	
	    public boolean isEmpty() {
	        return (top == -1);
	    }
	    
	    public String reverseString(String input) {
	        int len = input.length();
	        StringBuilder reversed = new StringBuilder(len);
	
	        for (int i = 0; i < len; i++) {
	            push(input.charAt(i));
	        }
	
	        while (!isEmpty()) {
	            reversed.append(pop());
	        }
	
	        return reversed.toString();
	    }
	
	    public boolean isPalindrome(String input) {
	        String reversed = reverseString(input);
	        return input.equals(reversed);
	    }
}
