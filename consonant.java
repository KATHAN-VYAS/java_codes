import java.util.*;
public class consonant {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence ");
        String str = sc.nextLine();
        int count = 0;
        int space = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u')
            {
                count++;
            }
            if (ch ==' ')
            {
                space ++;
            }
        }
        System.out.println("number of vovels in the sentance is "+count);
        System.out.println("number of consonant in the sentance is "+(str.length()-count-space));
    
    }  
}