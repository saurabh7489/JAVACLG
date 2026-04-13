// import javax.swing.table.TableCellEditor;;
// public class dayseven {
//     static int power(int x , int n)
//  {
// if(n==0){
//     return 1;

// }
// return x*power(x, n-1);
// }
//     public static void main(String[] args) {
//         int x=2;
//         int n=3;
        
//         System.out.println(power(x,n));
//     }
// }
// import javax.swing.table.TableCellEditor;;
// public class dayseven {
    
//  static int sum(int n)
//  {
//   if(n==0)
//   return 0;
  
//   return n%10 + sum(n/10);
// }
//  }
//     public static void main(String[] args) {
//         int n = 123;
//        System.out.println(sum(n));
//     }
// public class dayseven {
//  static int gcd(int a ,int b)
//  {
//     if(b==0)
//         return a;
//     return gcd(b,a%b);

    
//  }
//     public static void main(String[] args) {
//         int a = 6,b=4;
//         System.out.println(gcd(a,b));
//     }
// }

// public class dayseven {
// static int countzero(int n){
//     int count=0;
//     if(n==0)
//         return 0;
     
//     count=(n%10==0)?1:0;
//     return count + countzero(n/10);
// }
//     public static void main(String[] args) {
//         int n=1000;
//         System.out.println(countzero(n));
//     }
// }

// public class dayseven {
// static int sumarr(int[] arr,int i){

// if(i==arr.length) return 0;
// return arr[i]+sumarr(arr, i+1);
// }
//     public static void main(String[] args) {
//     int[] arr={0,1,2,3};
//     int i=0;
//     System.out.println(sumarr(arr, i));
//     }
// }

// public class dayseven {
//  static int countoccur(int[] arr ,int i,int key){
//     if(i==arr.length) return 0;
//     int count=(arr[i]==key)?1:0;
//     return count+countoccur(arr,i+1,key);

//  }
//     public static void main(String[] args) {
//         int [] arr={1,2,2,4,2,6,7};
//         int key = 2;
//         int i = 0;
//         System.out.println(countoccur(arr, i, key));
//     }
// }

// public class dayseven {
// static boolean presentornot(int[] arr,int key,int i){
//     if(i==arr.length) return false;
//     if(arr[i]==key) return true;
//     return presentornot(arr, key, i+1);

// }
//     public static void main(String[] args) {
//         int[] arr={1,2,2,4,2,6,7};
//         int key=2;
//         int i=0;
//         System.out.println(presentornot(arr, key, i));
//     }
// }

// public class dayseven {
// static boolean even(int[] arr,int i){
//     if(i==arr.length) return false;
//     if(arr[i]%2==0) return true;
//     return even(arr, i+1);

// }
//     public static void main(String[] args) {
//         int[] arr={1,2,2,4,2,6,7};
       
//         int i=0;
//         System.out.println(even(arr, i));
//     }
// }
// public class dayseven {
// static int swap(int[] arr,int key,int i){
//     if(i==arr.length) return 0;
//     if(arr[i]==key)
//         arr[i]=5;
    
//    swap(arr,key, i+1);

// }
//     public static void main(String[] args) {
//         int[] arr={1,2,2,4,2,6,7};
//        int key=2;
//         int i=0;
//         swap(arr, key, i);
//         for(int j=0;j<arr.length;j++);
//         System.out.println(swap(arr, key, i));
//     }
// }

// public class dayseven {
//  static int voval(String str,int i){
//   if(i==str.length()) return 0;
//   char ch=str.charAt(i);
//   int count = (ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u')?1:0;
//   return count + voval(str, i+1);
//  }
//     public static void main(String[] args) {
//         String str="hello";
//         int i=0;
//         System.out.println(voval(str, i));
//     }


public class dayseven {
 static int uppercase(String str,int i){
if(i==str.length()) return 0;
 }
    public static void main(String[] args) {
        String str="hello";
        int i=0;
        System.out.println(uppercase(str, i));
    }
}