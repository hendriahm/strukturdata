package demostack_push;
import java.util.*;
public class DemoStack_push {
public static void main(String[] args) {

// Creating an empty Stack
Stack<String> STACK = new Stack<String>();

// Use push() to add elements into the Stack
STACK.push("Minggu");
STACK.push("Senin");
STACK.push("Selasa");
STACK.push("Rabu");
STACK.push("Kamis");

// Displaying the Stack
System.out.println("Stack Awal: " + STACK);

// Pushing elements into the stack
STACK.push("Jumat");
STACK.push("Sabtu");

// Displaying the final Stack
System.out.println("Updata Stack: " + STACK);
}
}
