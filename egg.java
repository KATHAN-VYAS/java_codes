import java.util.*;
public class egg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter str:");    
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int count =0;
        for(int i =0;i<words.length;i++)
        {
            if (Character.isUpperCase(words[i].charAt(0)))
            {
                count++;
            }
        }
    }
}