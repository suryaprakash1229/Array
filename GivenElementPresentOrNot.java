import java.util.Scanner;
public class GivenElementPresentOrNot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        int size =sc.nextInt();  
        System.out.println("enter array:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();   
        }
        System.out.print("array: ");
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.print("\nsearch Element: ");
        int search=sc.nextInt();
        boolean flag=false;
        for(int j=0;j<size;j++){
            if(arr[j]==search){
                System.out.println("index of element is: "+j);
                flag=true;
                break;
            }
           
        }
           if(!flag){
                 System.out.println("enter valid number");
          }
            sc.close();
    }
}
