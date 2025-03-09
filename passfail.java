import java.util.*;
public class passfail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,pass=50;
        m=sc.nextInt();
        if(m>=pass){
            System.out.println("pass");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
