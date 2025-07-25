import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;
public class REmoveDuplicateELementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of Array:");
        int size=sc.nextInt();
        System.out.println("enter Array:");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Given Array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.print("\nArray after removing duplicates: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
