package basicjava;
import java.util.Scanner;
public class Ass1 {
        Scanner kb= new Scanner(System.in);
    public Ass1() {
        System.out.println("Enter Start Number:");
        int a= kb.nextInt();
        System.out.println("Enter end Number:");
        int b= kb.nextInt();
        if(a>b) {
            int sw = a;
            a=b;
          b=sw;
        }
        
        for(int x= a; x<=b; x+=1){
            System.out.println(x);
       }
    
    }
}
