class a{
    public static void main(String arg[]){
        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            for(int k=0;k<((5-i)*2);k++)
            System.out.print(" ");
        
       for(int l=0;l<i;l++)
        System.out.print("* ");
        System.out.println();
    }
    }
}