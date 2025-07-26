import java.util.Scanner;
public class SumArrayandIgnorenumbetween6and7{
    public static int calculateSum(int[] arr) {
        int total = 0;
        boolean skip = false;

        for (int num : arr) {
            if (num == 6) {
                skip = true;
            } else if (num == 7 && skip) {
                skip = false;
            } else if (!skip) {
                total += num;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int size = sc.nextInt();
        System.out.println("Enter Array:");
        int[] arr=new int[size];
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }       
        System.out.println("Sum for arr: " + calculateSum(arr));
    }
}
