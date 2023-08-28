import java.util.Arrays;
import java.util.Scanner;
public class Sorter {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");
        int len = take.nextInt();
        int[] arr = new int[len];
        for(int i=0; i < arr.length;i++)
        {
            System.out.println( i+1 +". number: ");
            int num = take.nextInt();
            arr[i] = num;
        }
        Arrays.sort(arr);
        System.out.print("Sort: ");
        System.out.println(Arrays.toString(arr));
    }
}
