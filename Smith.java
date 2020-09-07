import java.util.*;
class Smith
{
    int sumDig(int n)
    {
        int s=0;
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
    int sumPrimeFact(int n)
    {
        int i=2, sum=0;
        while(n>1)
        {
            if(n%i==0)
            {
                sum=sum+sumDig(i); 
                n=n/i;
            }
            else
                i++;
        }
        return sum;
    }

    boolean isComposite(int n)
    {
        int c=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c>2)
            return true;
        else
            return false;
    }
 
    public static void main(String args[])
    {
        Smith ob=new Smith();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        if(ob.isComposite(n) == false)
        {
            System.out.println("You have entered a non-Composite Number. Please enter a composite number");
        }
        else
        {
            int a=ob.sumDig(n);
            int b=ob.sumPrimeFact(n);
 
          
            if(a==b)
                System.out.print( "SMITH Number");
            else
                System.out.print("NOT SMITH Number");
        }
    }
}