import java.util.*;
class float_array_input{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length ");
        int len = sc.nextInt();
        double arr [] = new double[len];
        for (int i=0;i<len;i++)
        {
            System.out.print("enter "+i+"element");
             arr[i]=sc.nextDouble();
        }
        for(int i= 0;i<len;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
