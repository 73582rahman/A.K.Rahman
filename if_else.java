import java.util.Scanner;

class if_elsedemo
{
    public static void main(String args[])
    {
        Scanner demo=new Scanner(System.in);

        int a=demo.nextInt();
        int b=demo.nextInt();
        if(a>b)
        {
            System.out.println("a is grater than b");
        }
        else{
            System.out.println("b is grater than a");

        }

    }
}