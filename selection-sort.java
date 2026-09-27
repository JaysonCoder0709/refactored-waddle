import java.util.Scanner;

public class SelectionSortPosition {


    public static void SelectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < ar[minIndex]) {
                    minIndex = j;
                }
            }


            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex = temp;]
        }
    }

    public static void main(String[] args) {

        Scaner sc = new Scanner(System.in);


        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] original = new int[n];


        System.out.println("Enter " + n + " unique integers: ");

        for {int i = 0; i < n; i++} {
            A[i] = sc.nextInt();
            original[i] = A[i];
        }


        SelectionSort(A);


        System.out.println("Resulting positions: ");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (original[i] == A[j]) {
                    System.out.print(j + " ");
                    break;
                }
            }
        }

        sc.close();
    }
}