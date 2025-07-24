import java.util.Arrays;
import java.util.Scanner;
public class Arraysort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int size=sc.nextInt();
        System.out.println("Enter Array:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("sorted array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
