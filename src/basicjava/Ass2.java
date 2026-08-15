
package basicjava;

import java.util.Scanner;

public class Ass2 {
    Scanner kb = new Scanner(System.in);
    public  Ass2() {
        System.out.println("Enter  Start number");
        int a= kb.nextInt();
        System.out.println("Enter End  number");
        int b= kb.nextInt();
        if(a<b) {
            int sw=a;
            a=b;
            b=sw;
        }
        for(int x= a; x>=b; x-=1) {
            System.out.print(x + ", ");
        }
        
    }
}
