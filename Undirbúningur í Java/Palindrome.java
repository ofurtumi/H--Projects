import java.util.Stack;

public class Palindrome {
    public static String reverseString(String str) {
        char[] reverseArray= new char[str.length()];
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        int i = 0;
        while (!stack.isEmpty()) {
            reverseArray[i++] = stack.pop();
        }

        return new String(reverseArray);

    }

    public static String palli(String str) {
        String str2 = reverseString(str);
        char[] reverseArray = new char[str.length()];
        char[] forwardArray = new char[str.length()];

        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') stack1.push(str.charAt(i));
            if (str2.charAt(i) != ' ') stack2.push(str2.charAt(i));
        }
        
        int i = 0;
        while (!stack1.isEmpty()) {
            forwardArray[i] = stack1.pop();
            reverseArray[i++] = stack2.pop();
        }

        String forward = new String(forwardArray);
        String reverse = new String(reverseArray);



        if (forward.equals(reverse)) return " a palindrome";
        else return " not a palindrome";
    }

    public static void main(String[] args) {
        String str = System.console().readLine("Write something you think is a palindrome: ");

        System.out.println(str + " <--reversed--> " +  reverseString(str));
        System.out.println("This is" + palli(str));
        
    }
}