import java.util.*;
public class vowelorconsonants{
    public static void main(String[] args) {
      Scanner x= new Scanner(System.in);
      char ch = x.next().charAt(0);
        x.close();
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}