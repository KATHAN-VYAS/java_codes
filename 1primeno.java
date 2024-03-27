import java.util.*;
class prime      // in public class(use file name exact) : public class 1primeno
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int flag =0 ;
        for(int i = 0;i<= a;i++)
        {
            if (a %(i+1)==0)
            {
                    
                flag =flag +1;
                
            }
        }
        if(flag == 2)
        {
            System.out.println("the number is prime");
        }
        else
        {
            System.out.println("the number is not prime");
        }
    }
}

