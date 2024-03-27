import java.util.*;
 class odd_even 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter upper limit of range ");
        int a = sc.nextInt();
        System.out.println("enter lower limit of range ");
        int b = sc.nextInt();
        int odd = 0;
        int even = 0;
        
        for (int i = a;i<=b;i++)
        {
            if (i%2==0)
            {
                even = even +i;
                
            }
            else{
                odd = odd+i;
            }
            
        }        
        System.out.println("sum of odd is "+ odd);
        System.out.println("sum of even is "+even);
        System.out.println("sum of both is "+ (odd+even));
    }
}
