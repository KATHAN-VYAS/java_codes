
public class sorting {
    public static void main(String[]args){
        int[] a = {1,3,2,5,6,4,100,53};
        for(int i =0;i<8;i++)
        {
            for (int j =0;j<8;j++)
            {
                if (a[i]>a[j])
                {
                    
                     int temp =  a[i];
                     a[i]=  a[j];
                     a[j] =  temp;
                }
                
            }
        }for (int i=7;i>=0;i--)
        {
            System.out.println(a[i]);
        }
        
    }
    
}
