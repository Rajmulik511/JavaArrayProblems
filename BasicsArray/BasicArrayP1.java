//Search in Array
import java.util.Scanner;

public class BasicArrayP1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Integers in Array : ");
        int num = sc.nextInt();
        int[] arr=new int[num];
        for(int i =0;i<arr.length;i++){
            arr[i]=i+1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the Key to Search : ");
        int key = sc.nextInt();
        sc.close();
        for(int i=0;i<arr.length;i++){
            if (arr[i]==key){
                System.out.println("key found at Index : "+i);
                break;
            }
        }
    }
}