// public class Patterns {
//     public static void main(String[] args) {
//         int x=5;
//         int y=5;
//         for (int i = 0; i < y; i++) {
//             for (int j = 0; j < x; j++) {
//                 System.out.print("*  ");
//             }
//             System.out.println();
//         }
//     }
// }

public class Patterns {

    public static void main(String[] args) {
        int n=4;
        int m=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}