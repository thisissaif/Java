import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a =ip.nextInt();
        System.out.print("Enter 2nd number : ");
        int b =ip.nextInt();
        System.out.println("Press a number\n1 for +\n2 for -\n3 for *\n4 for /\n5 for %");
        int c =ip.nextInt();
        // Switch :
        // switch (c) {
        //     case 1:
        //         System.out.println(a+b);
        //         break;
        //     case 2:
        //         System.out.println(a-b);
        //         break;
        //     case 3:
        //         System.out.println(a*b);
        //         break;
        //     case 4:
        //         System.out.println(a/b);
        //         break;
        //     case 5:
        //         System.out.println(a%b);
        //         break;
        //     default:
        //         System.out.println("Enter a Valid input");
        //         break;
        // }
        if (c==1) {
            System.out.println(a+b);

        }else if (c==2) {
            System.out.println(a-b);
        }else if (c==3) {
            System.out.println(a*b);
        }else if (c==4){
            System.out.println(a/b);
        }else if (c==5) {
            System.out.println(a%b);
        }else{
            System.out.println("Enter valid Input");
        }
        ip.close();
    }
}