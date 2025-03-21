class car {
    int speedlimit=120;
}
class audi extends car{
    int speedlimit=180;
    void show(){
        System.out.println(super.speedlimit);
        System.out.println(speedlimit);
    }
}
public class program{
    public static void main(String[] args) {
        audi b=new audi();
        b.show();
    }
}
