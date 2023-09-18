import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicArrayP6 {
    
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int A,B;
        int[] arr= new int[]{1,4,5,2,7,8,3};
        System.out.print("Enter value for A : ");
        A = sc.nextInt();
        System.out.print("Enter value for B : ");
        B = sc.nextInt();
        sc.close();
        List<Integer> list1 = new ArrayList<>();
        for(int i : arr){
            list1.add(i);
        }
        boolean flag = false;
        System.out.println(list1);
        for(int i =A; i<=B;i++){
            System.out.println(i);
            if(list1.contains(i)){
                flag=true;
            }
            else{
                flag=false;
            }
        }
        if(flag==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
