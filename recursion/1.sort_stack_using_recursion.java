import java.util.Scanner;
import java.util.Stack;

public class SortStackRecursively {

    // Recursive method to sort stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, top);
        }
    }

    // Helper method to insert element in sorted order
    private static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
        } else {
            int top = stack.pop();
            insertInSortedOrder(stack, value);
            stack.push(top);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter number of elements in stack:");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }

        sortStack(stack);

        System.out.println("Sorted stack (top to bottom):");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}
