import java.util.*;
 class firstNprime 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of prime number you want");
        int n = sc.nextInt();
        int count =0;
        for (int i =0;;i++)
        {
            int flag = 0;
            for (int j=1; j<=i; j++)
            {
                if (i % (j) == 0)
                {
                    flag = flag + 1;
                }
            }
            if (flag == 2)
            {
                count = count + 1;
                System.out.println(i);
            }
            if (count == n)
                break;
        }
    }
}  
