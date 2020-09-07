/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.io.*;
class wordcount {
    public static void main(String args[] ) throws Exception {
        int l,i,n,p,nowwv;
        boolean flag = true;
        char ch, fc, lc, lastchar;
        String str, prefix="", suffix="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        l= str.length();
        lastchar = str.charAt(l-1);
        if(lastchar!='.' && lastchar != '?' && lastchar != '!')
            System.out.println("INVALID INPUT");
        else {
            p=0;
            nowwv =0;
            for(i=0;i<l;i++){
                ch = str.charAt(i);
            
            if (ch==' ' || ch =='?' || ch=='!' || ch== '.'){
                if(isVowel(str.charAt(p)) && isVowel(str.charAt(i-1))){
                    prefix += str.substring(p,i) + " ";
                    nowwv++;
                }
                else{
                    suffix += str.substring(p,i) + " ";
                }
                p=i+1;
            }
        }
        System.out.println(nowwv);
    }
}
public static boolean isVowel(char ch){
    if(ch=='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        return true;
    else
        return false;
}
}