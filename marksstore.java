public class marksstore
{
  public static void main(String[] arg)
  {
    int marks[]={85,90,78,88,76};
    int index=7;
    int newmark=95;
    if(index<0||index>marks.length)
    {
       System.out.println("index out of bound! valid range is 0 to 4");
    }
    else{
        System.out.println(marks[index]);
        marks[index]=newmark;
        System.out.println("updated");
    }
  }    
}
