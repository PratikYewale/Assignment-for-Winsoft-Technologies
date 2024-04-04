import java.util.Scanner;

public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }
        int i = k + 1;
        int j = 0;
        int p = 0;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[p] = X[i];
                i++;
            } else {
                X[p] = Y[j];
                j++;
            }
            p++;
        }

        while (j < n) {
            X[p] = Y[j];
            j++;
            p++;
        }
    }


    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of array X (separated by spaces):");
        String[] XInput = scanner.nextLine().split(" ");
        System.out.println("Enter the elements of array Y (separated by spaces):");
        String[] YInput = scanner.nextLine().split(" ");

        int[] X = new int[XInput.length];
        int[] Y = new int[YInput.length];

        for (int i = 0; i < XInput.length; i++) {
            X[i] = Integer.parseInt(XInput[i]);
        }
        for (int i = 0; i < YInput.length; i++) {
            Y[i] = Integer.parseInt(YInput[i]);
        }

        mergeArrays(X, Y);

        System.out.print("Output: ");
        printArray(X);

        scanner.close();
    }
}
