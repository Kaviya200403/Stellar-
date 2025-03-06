import java.util.*;
class a{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array:");
        int a= sc.nextInt();
        int arr[]=new int[a];
        int s=0;
        for(int i=0;i<a;i++)
        arr[i]=sc.nextInt();
        for(int j=0;j<=arr.length;j++)
         System.out.println(arr[j]);
        for(int j=0;j<=arr.length;j++)
        s=s+arr[j];
        System.out.println(s);
    }
}