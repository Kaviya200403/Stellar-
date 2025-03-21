class math {
    void formula(){
        System.out.println("Math formula");
    }
}
class chemistry extends math{
    void chemical(){
        System.out.println("chemical");
    }
}
class bio extends chemistry{
    void biology(){
        System.out.println("biology");
    }
}
public class a{
    public static void main(String[] arg){
        bio sc=new bio();
        sc.biology();
        sc.chemical();
        sc.formula();
    }
}