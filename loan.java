import java.util.Scanner;

class loan
{
    public static void main(String args[])
    {
        Scanner lo=new Scanner(System.in);

        int salary=lo.nextInt();
        int age=lo.nextInt();
         
        if(salary>=20000 || age<=25)
        {
            System.out.println("eligible for loan");
            
       int loanamt=lo.nextInt();

         if(loanamt<=50000)
         {
            System.out.println("loan available");
         }
         else if(loanamt>50000)
         {
            System.out.println("max loanamt is 50000");
         }
        }
    }
}