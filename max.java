import java.util.Scanner;
class max{
public static void main(String[] args)
{
Scanner input= new Scanner(System.in);
System.out.print("enter the number of elements:");
int elements=input.nextInt();
int[] array= new int[elements];
for(int i=0;i<elements;i++){
System.out.print("enter a number:");
array[i]=input.nextInt();
}
int max=array[0];
int min=array[0];
for(int i=0; i< elements;i++){
if(array[i]>max){
max=array[i];
}
if(array[i]<min){
min=array[i];
}
}
System.out.print("the maximum number is:"+max);
System.out.println();
System.out.print("the minimum number is:"+min);
}
}