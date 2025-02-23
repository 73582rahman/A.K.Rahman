import java.util.Scanner;

class oddeven
{
    public static void main(String args[])
    {
        Scanner oe=new Scanner(System.in);

        int num=oe.nextInt();

        if(num%2==0)
        {
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
}