import java.util.*;
class hr_min_sec
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter in term of seconds ");
        int sec = sc.nextInt();
    
        int rem1 = sec%3600;
        int hour = (sec - rem1)/3600;
        int rem2 = (sec- hour*3600)%60;
        int minute = (sec - hour*3600 - rem2)/60;
        int second = sec - hour*3600 - minute*60;
        

        System.out.print("hour :"+hour +" --");
        System.out.print("minute :"+minute+" --");   
        System.out.print("second :"+second);
    }   

}
