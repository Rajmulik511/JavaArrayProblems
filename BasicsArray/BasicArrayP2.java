//Min and Max Values in array
import java.util.*;
public class BasicArrayP2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Integers in Array : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i =0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min =arr[i];
        }
        System.out.println("Max : "+ max);
        System.out.println("Min : "+ min);
    }
}