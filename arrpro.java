import java.util.*;
class arr{
    public static void main(String arg[]){
       
        Scanner sc=new Scanner(System.in);
        
                int b=sc.nextInt();
                int c=sc.nextInt();
                int a[][]=new int[b][c];
                for(int i=0;i<b;i++){
                    for(int j=0;j<c;j++){
                         a[i][j]=sc.nextInt();
            }}
            for(int k=0;k<b;k++){
                for(int l=0;l<=c;l++){
                    System.out.print(a[k][l]);
                    
                }
                System.out.println(); 
            }
            sc.close();
           
            
            
        }

        
    }
