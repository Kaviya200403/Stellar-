import java.util.*;
public class argumethod {

    public static void Array(int n,int m){
        int ar[] = new int[n];
        int c=0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            ar[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(ar[i]==m){
                c++;
            }
        }
        if(c!=0){
            System.out.println("found");
        }
        else{
            System.out.println("Not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Array(n,m);

    }
}
