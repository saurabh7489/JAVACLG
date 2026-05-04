// import java.util.*;
// public class daynine {
//   static int recursioin(int a,int b){
//     int sum=a+b;
//    return sum;
//   }
//     public static void main(String[] args) {
       
//         System.out.println(recursioin(2,3));

//     }
// }

// public class daynine {

//     public static void main(String[] args) {
      
//      for(int i=1;i<=4;i++){
//         for(int j=1;j<=i;j++){
           
     
//             System.out.print(i);}
     
     
//       System.out.println();}
//     }
// }

// public class daynine {
// static int pattern(){
//     int a=4;
//     for(int i=1;i<=a;i++){
//         for(int j=i;j<=a;j++){
//             System.out.print(i);
//         }
//         System.out.println();
//     }


// return 0;
// }
//     public static void main(String[] args) {
//         System.out.print(pattern());
//     }
// }

import java.util.*;

public class daynine {
    public static int[] sum(int n[],int target){
       
        
         
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
             if(target==n[i]+n[j]){
               return new int[]{i, j};
             }
            }}
            return new int[] {-1,-1};
        
    }

    public static void main(String[] args) {
      int result[]= sum(new int[]{3,2,4}, 6);
       System.out.println(Arrays.toString(result));
    }
}