import java.util.*;
 class not_divisible 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int count =0;
        for (int i = 1;i<101;i++)
        {
            if (i%2!=0)                          // && can be used instead of neasted loops
            {
                if (i%5!=0)
                {
                    if (i%7!=0)
                    {
                        count = count +1;
                    }
                    else
            {
                continue ;
            }
                }
                else
            {
                continue ;
            }
                
            }
            else
            {
                continue ;
            } 
        }
        System.out.println("no of numbers not divisible by 2,5,7 is "+ count);
    }

}
    

