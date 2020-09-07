import java.util.*;
class nextpower
{
    static int nextPowerOf2(int n) 
    { 
        int count = 0; 
        if (n > 0 && (n & (n - 1)) == 0) 
            return n; 
  
        while(n != 0) 
        { 
            n >>= 1; 
            count += 1; 
        } 
  
        return 1 << count; 
    }
     	public static void main(String[] args) 
     	{
	       Scanner x=new Scanner(System.in);
	       int n=x.nextInt();
           System.out.println(nextPowerOf2(n)); 
	}
}
