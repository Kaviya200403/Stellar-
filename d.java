import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int k=0;k<((m-i));k++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            for(int l=1;l<i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=m-1;i>0;i--){
            for(int k=0;k<((m-i));k++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            for(int l=1;l<i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
