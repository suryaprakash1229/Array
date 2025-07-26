import java.util.Scanner;
public class FourIntNumToReverse2_2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        if (size == 4) {
            System.out.println("Enter Array:");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Array");
            System.out.println(arr[0] + " " + arr[1]);
            System.out.println(arr[2] + " " + arr[3]);
            System.out.println("Reverse Array:");
            System.out.println(arr[3]+" "+arr[2]);
            System.out.println(arr[1]+" "+arr[0]);
        } else {
            System.out.println("Enter four integers");
        }
        sc.close();
    }
}
