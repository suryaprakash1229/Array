import java.util.Scanner;
public class MaxiMiniArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        System.out.println("enter array: ");
        int[] arr = new int[size];
        arr[0]=sc.nextInt();
        int max=arr[0];
        int mini=arr[0];
        for(int i=1;i<size;i++){
            arr[i]=sc.nextInt();
         if(arr[i]>max){
            max=arr[i];
         }
         if(arr[i]<mini){
            mini=arr[i];
         }
        }

        System.out.print("array: ");
    for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println("\nmax: "+max);
        System.out.println("mini: "+mini);
    }
}
