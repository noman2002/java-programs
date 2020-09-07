import java.util.*;
public class decimal2binary {
    public static void decToBinary(int n) {
        for (int i = n-1; i >= 0; i--) {
            int k = n >> 1;
            if ((k & 1) > 0)
                System.out.print("1");
            else
                System.out.print("0");
        }
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int d = x.nextInt();
        decToBinary(d);
        x.close();
    } 
}