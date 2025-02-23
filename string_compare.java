import java.util.Scanner;

class compare
{
    public static void main(String args[])
    {
        Scanner str=new Scanner(System.in);

        String f1=new String("benz");
        String f2=new String("benz");
            
         System.out.println(f1==f2); //false
                  System.out.println(f1.equals(f2)); //true

    }
}