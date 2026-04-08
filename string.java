import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        String str1="hello";
        String str2=new String("hi");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.length());
        System.out.println(str1.substring(0,2));
        System.out.println(str1.replace('l','z'));
        String rev="";
        for(int i = str1.length()-1;i>=0;i--)
        {
            rev = rev+ str1.charAt(i);

        }
        System.out.println(rev);
    }
    
}
