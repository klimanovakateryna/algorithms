import java.util.Stack;

public class DecimalToBinary {

    public static void main(String[] args) {
        int testInput = 77;
        convertDecToBin(testInput);
    }

    public static void convertDecToBin(int input) {
        Stack<Integer> st = new Stack<>();

        if(input == 0){
            System.out.println("0");
            return;
        }

        while (input != 0) {
            int remainder = input % 2;
            st.push(remainder);
            input /= 2;
        }

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}

// Given an integer n, return a binary string representing its representation in
// base -2.
// Note that the returned string should not have leading zeros unless the string
// is 0.

// Algorithm
// Divide by 2
// Store the remainder inside a stack
// Repeat until quotient becomes 0
// Pop all the elements of stack and print
