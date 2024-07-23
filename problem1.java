import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int i;
        do {
            System.out.print("Enter 1 to Input marks, \nOr Enter 0 to stop \n : ");
            i=ip.nextInt();
            if (i==1) {
                System.out.print("Enter Marks : ");
                int n=ip.nextInt();
                if (n>=90) {
                    System.out.println("This is Good");
                }else if (n>=60) {
                    System.out.println("This is also Good");
                }else if (n>0) {
                    System.out.println("This is Good as Well");
                }else{
                    System.out.println("Invalid Input");
                }
            }else if (i!=0) {
                System.out.println("Invalid input");
            }

        } while (i!=0);
        System.out.println("program Ended");
        ip.close();
    }    
}


