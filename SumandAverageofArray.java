import java.util.Scanner;
public class SumandAverageofArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size =sc.nextInt();
        System.out.println("enter array: ");
        int[] arr = new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double average =sum/size;
        System.out.println("sum of array: "+sum);
         System.out.println("average of array: "+average);
    }
}
