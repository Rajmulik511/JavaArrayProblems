//PRODUCT OF ELEMENTS IN ARRAY 

import java.util.Scanner;
public class BasicArrayP4 {
    public static int ArrProduct(int[] arr){
        int mul =1;
        for(int i =0;i<arr.length;i++){
            mul*=arr[i];
        }
        return mul;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Integers in Array : ");
        int num = sc.nextInt();
        sc.close();
        int[] arr = new int[num];
        for(int i =0; i<arr.length;i++){
            arr[i]=i+1;
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Product of Elements in array : "+ArrProduct(arr));
    }
}
