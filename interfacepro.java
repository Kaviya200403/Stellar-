interface mul {
    int i=100;
    void show();
}
class add implements mul{
    int i=200;
    public void show(){
        System.out.println(i);
    }
}
public class interfacepro{
    public static void main(String arg[]){
       add b=new add();
       b.show();
    }
}
