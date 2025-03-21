public class invalidtask 
{
    public static void main(String[] arg)
    {
        String[] tasks={"task1,task2,task3"};
        int index=5;
        String newtask="task4";
        try{
            tasks[index]=newtask;
            System.out.println("task updated successfully");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index! please try again");
        }
    }
}
