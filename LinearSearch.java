import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter the elements of array");
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        System.out.println("enter element you want to search");
        int element = sc.nextInt();
        for (int i = 0; i < n ; i++) {
           if(element == arr[i]){
               System.out.println("element is at index : " + i);
               return;
           }
        }
        System.out.println("element not found");

    }
}
