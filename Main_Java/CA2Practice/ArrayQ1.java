import java.util.Scanner;
public class ArrayQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int max2=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i] != max && arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
