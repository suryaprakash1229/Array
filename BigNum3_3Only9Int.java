import java.util.Scanner;
public class BigNum3_3Only9Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size:");
        int size = sc.nextInt();
        if(size==9){
            System.out.println("Enter Array:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array:");
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
        System.out.println(arr[3]+" "+arr[4]+" "+arr[5]);
        System.out.println(arr[6]+" "+arr[7]+" "+arr[8]);
        int max=arr[0];
        for(int j=0;j<size;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        System.out.println("biggest element in array is:"+max);
        }else{
            System.out.print("enter 9 integer only");
        }
    }
}
