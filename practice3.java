import java.util.Scanner;
class practice3
{
    public static void main(String args[])
    {
        Scanner prac2=new Scanner(System.in);

        String name=prac2.nextLine();
        float score=prac2.nextInt();
        prac2.nextLine();
        String department=prac2.nextLine();
        
        System.out.println("My name is"+name);
        System.out.println("My score is"+score/10);
        System.out.println("My department is"+department);

    }
}