package basicjava;

import java.util.Scanner;
public class evcPlus {
    Scanner money = new Scanner(System.in);
    int pin=2030;
    int currentBlance = 900;
    public evcPlus() {
        System.out.println("Enter You Pin");
        int secret = money.nextInt();
        if(secret != pin) {
            System.out.println("Incorrect you pin");
        }else {
            System.out.println("1.Check Balance \n2.Deposit Money \n3.Withdraw Money \n4.Exit");
            int options = money.nextInt();
            
            switch (options) {
                case 1:
                    System.out.println("You Blance is: " + currentBlance);
                    break;
                case 2: 
                    System.out.println("how much depost money");
                       int blance = money.nextInt();
                    if(blance > 0) {
                        blance = blance + currentBlance;
                        System.out.println("You blance is:"  + blance);
                    }else if(blance < 0) {
                        System.out.println("Invalid amount");
                    }
        }
        }
    }
    
}
