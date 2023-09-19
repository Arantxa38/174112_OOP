package package1;

class Ejecutar {
    public void iniciarPrograma() {
        
        MyStacks stack = new MyStacks(5);
        stack.push('A');
        stack.push('B');
        stack.push('C');
        System.out.println("Pop: " + stack.pop()); // Pop: C

        MyQueues queue = new MyQueues(5);
        queue.insert('X');
        queue.insert('Y');
        queue.insert('Z');
        System.out.println("Eliminar: " + queue.delete()); // Delete: X

        String str = "radar";
        System.out.println("Frase invertida: " + stack.reverseString(str)); // Reversed String: radar
        System.out.println(str + " es un palindromo?: " + stack.isPalindrome(str)); // Is Palindrome: true

    }
}
