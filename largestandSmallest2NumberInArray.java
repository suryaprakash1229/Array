import java.util.Scanner;
public class largestandSmallest2NumberInArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int size=sc.nextInt();
        System.out.println("Enter Array:");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int lar1=Integer.MIN_VALUE;
        int lar2=Integer.MIN_VALUE;
        int smal1=Integer.MAX_VALUE;
        int smal2=Integer.MAX_VALUE;
        System.out.println("Array:");
        for(int num:arr){
            System.out.print(num+" ");
            if(num>lar1){
                lar2=lar1;
                lar1=num;
            }else if(num>lar2&&num!=lar1){
                lar2=num;
            }
            if(num<smal1){
                smal2=smal1;
                smal1=num;
            }else if(num<smal2&&num!=smal1){
                smal2=num;
            }
            
        }
        
        System.out.println("\nsecond largest number in array:"+lar2);
        System.out.println("second smallest number in array:"+smal2);
    }
}
