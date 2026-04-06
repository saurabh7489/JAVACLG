// import java.util.Scanner;

// public class class1 {
//     public static int add(int a,int b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = add(a, b);
//         System.out.println(sum);
//     }

    
// }
// import java.util.Scanner;

// public class lec1 {
//     public static int freq(int a,int b)
//     {
//         int count=0;
//         while(a>0){
// int rem=a%10;
// if (rem==b) 
//     count++;
//     a=a/10;
    
//         }
//         return count;
    
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a= sc.nextInt();
//         int b=sc.nextInt();
//         int count=freq(a, b);
//         System.out.println(count);

//     }
// }
// import java.util.Scanner;

// public class class1 {
// public static int binary(int a){
//   while (a>0) {
//     int rem
//   }
// }
    

//     public static void main(String[]args){
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int convert=binary(a);
// System.out.println(convert);
//     }
// }

// import java.util.Scanner;

// public class lec1 {

//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int[] arr=new int[a];
//     for(int i=0;i<a;i++){
//       arr[i]=sc.nextInt();
//     }
//     for(int i=0;i<a;i++){
//       System.out.print(arr[i]+"");
//     }
//   }
// }

// import java.util.Scanner;

// public class lec1 {

//     public static void main(String[] args) {
       
//     }
// }
// rotate arrey
// inverse arrey
// reverse arrey

// import java.util.Scanner;

// public class DSA {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int rows = 3;
//         int cols = 3;
//         int[][] matrix = new int[rows][cols];

//         System.out.println("Enter elements:");

//         for(int i = 0; i < rows; i++) {
//             for(int j = 0; j < cols; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//     }
// }




// import java.util.Scanner;

// public class DSA {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int rows = 3;
//         int cols = 3;
//         int[][] matrix = new int[rows][cols];

//         System.out.println("Enter elements:");

//         for(int i = 0; i < rows; i++) {
//             for(int j = 0; j < cols; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//     }
// }

import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[2][2];

        System.out.println("Enter elements:");

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is:");

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


