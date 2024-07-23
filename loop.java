public class loop {
    public static void main(String[]args){
        // for(int i=1;i<=10;i++){
        //     System.out.println(2*i);
        // }
        
        // int i=1;
        // while (i<=10) {
        //     System.out.println(2*i);
        //     i++;
        // }

        int i=1;
        do {
            if(i%2==0){
                System.out.println(i);
            }
            // System.out.println(2*i);
            i++;
        } while (i<=50);
    }
}
