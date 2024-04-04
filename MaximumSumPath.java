import java.util.Scanner;

public class MaximumSumPath {
    public static int findMaxSumPath(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;

        int i = 0, j = 0;
        int sumX = 0, sumY = 0;
        int result = 0;

        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i++];
            } else if (X[i] > Y[j]) {
                sumY += Y[j++];
            } else {
                result += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }

        while (i < m) {
            sumX += X[i++];
        }

        while (j < n) {
            sumY += Y[j++];
        }

        result += Math.max(sumX, sumY);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of array X (separated by spaces):");
        String[] XInput = scanner.nextLine().split(" ");
        int[] X = new int[XInput.length];
        for (int i = 0; i < XInput.length; i++) {
            X[i] = Integer.parseInt(XInput[i]);
        }

        System.out.println("Enter the elements of array Y (separated by spaces):");
        String[] YInput = scanner.nextLine().split(" ");
        int[] Y = new int[YInput.length];
        for (int i = 0; i < YInput.length; i++) {
            Y[i] = Integer.parseInt(YInput[i]);
        }

        int maxSum = findMaxSumPath(X, Y);
        System.out.println("The maximum sum path is: " + maxSum);

        scanner.close();
    }
}
