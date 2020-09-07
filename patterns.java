import java.util.Scanner;
public class patterns {
    public static void main(String agrs[]) {
    Scanner x= new Scanner(System.in);
    int a=x.nextInt();
    x.close();
    for(int i=0;i<a;i++)
    {
        for(int j=0;j<a;j++)
        {
            if(i==j||i==a-j-1)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    }
}