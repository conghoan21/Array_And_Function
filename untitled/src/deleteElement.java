import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the number of elements in the array: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];

        System.out.println("Enter the element for array: ");
        for (i = 0; i < n; i++) {
            System.out.print("The element " + i + ": ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Enter number integer k: ");
        int k = scanner.nextInt();

        for (c = i = 0; i < n; i++) {
            if (A[i] != k) {
                A[c] = A[i];
                c++;
            }
        }

        n = c;
        System.out.println("Array after deleting element " + k + " is: ");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");

        }
    }
}
