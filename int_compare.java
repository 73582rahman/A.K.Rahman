import java.util.Scanner;

class comparison
{
    public static void main(String args[])
    {
        Scanner com=new Scanner(System.in);

        int a1=com.nextInt(); 
        int a2=com.nextInt(); 

        if(a1==a2)
        {
            System.out.println("both are equal");
        }
        else{
            System.out.println("both are unequal");
        }


    }
}