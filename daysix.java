// import java.util.Scanner;
// public class daysix {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         String n= "abc";
//         int count=0;
//         for(int i=0;i<n.length();i++){
//             for(int j=i;j<n.length();j++){
//                 if(n.charAt(i)==n.charAt(j)){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }

// import java.util.Scanner;
// public class daysix {

//     public static void main(String[] args) {
//         String str1="abc";
//         char remove='a';
//         String result="";
//         for(int i=0;i<str1.length();i++){
//         if(str1.charAt(i)!=remove){
//         result+=str1.charAt(i);
//         }
//         }
//         System.out.println(result);
//     }
// }

public class daysix {

    public static void main(String[] args) {
        String str1="a023rurh4938";
        char max='0';
        for(int i=0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(ch >='0'&& ch<='9'&&ch>max){
            max=ch;
            }
        }
        System.out.println(max);
    }
}