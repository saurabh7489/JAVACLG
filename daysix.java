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

// public class daysix {

//     public static void main(String[] args) {
//         String str1="a023rurh4938";
//         char max='0';
//         for(int i=0;i<str1.length();i++){
//             char ch = str1.charAt(i);
//             if(ch >='0'&& ch<='9'&&ch>max){
//             max=ch;
//             }
//         }
//         System.out.println(max);
//     }
// }

// public class daysix {

//     public static void main(String[] args) {
//         String str1="aaabbbgggeeeyy";
//         String result ="";
//         result+=str1.charAt(0);
//         for(int i=0;i<str1.length();i++){
//             if(str1.charAt(i)!= str1.charAt(i-1)){
//                 result+= str1.charAt(i);
//             }
//         }
//         System.out.println(result);
//     }
// }

// public class daysix {

//     public static void main(String[] args) {
//         String str1="123abfsd";
//     boolean isNum = true;
//     for(int i=0;i<str1.length();i++){
//     if(str1.charAt(i)<'0'|| str1.charAt(i)>'9'){
        
//         isNum =false;
//         break;
//     }
// }
//     System.out.println(isNum);
// }
// }
import javax.swing.table.TableCellEditor;;
public class daysix {
    static int fact(int n)
{
   
   if(n==1){
    return 1; }
    return n* fact(n-1);
}

   

    public static void main(String[] args) {
        
        System.out.println(fact(3));
    }
}