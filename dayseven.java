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

public class dayseven {
static int sumarr(int[] arr,int i){

if(i==arr.length) return 0;
return arr[i]+sumarr(arr, i+1);
}
    public static void main(String[] args) {
    int[] arr={0,1,2,3};
    int i=0;
    System.out.println(sumarr(arr, i));
    }
}