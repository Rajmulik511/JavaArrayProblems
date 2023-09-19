//Form the Largest Number from Digits in Array
public class BasicArrayP7 {
    public static int[] DescBubble_Sort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int num : arr){
            System.out.print(num);
        }
        System.out.println();
        return arr;
    }
    public static void main(String[] args){
        int[] arr = new int[]{9,0,9,1,3,0};
        System.out.println("Desc Bubble Sort : ");
        DescBubble_Sort(arr);
    

    }
}
