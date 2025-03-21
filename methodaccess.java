class methodaccess {
     void show(){
            int a;
            a=10;
            System.out.println(a);
    }}
class b extends methodaccess{
    public static void main(String arg[]){
        methodaccess ob=new methodaccess();
        ob.show();
}}
    


