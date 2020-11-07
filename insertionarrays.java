import java.util.Arrays;
import java.util.Scanner;

public class insertionarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[]ar=new int[m];
        for(int i=0;i<ar.length;i++ )
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("enter position");
        int indexposition=sc.nextInt();
        System.out.println("enter element in array");
        int newvalue=sc.nextInt();
        for(int i=ar.length-1;i>=indexposition;i--) {
            ar[i] = ar[i-1];

        ar[indexposition]=newvalue;}
        System.out.println(Arrays.toString(ar));
    }
}
