import java.util.*;

class geometry{
        static double area(double c)
        {return 3.14*c*c;}
        static int area(int a)
        {return a*a;}
        static int area(int a,int b)
        {
            return a*b;
        }
        static double area(double c,double d)
        {
            return c*d/2;
        }
}

public class areaoverload {
    public static void main (String[] args)
    {
        System.out.println(geometry.area(1.50));
        System.out.println(geometry.area(10));
        System.out.println(geometry.area(10,20));
        System.out.println(geometry.area(5.00,10.50));
    }    
}
