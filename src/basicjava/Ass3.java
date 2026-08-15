package basicjava;
import java.util.Scanner;
public class Ass3 {
    Scanner kb = new Scanner(System.in);
    public Ass3() {
        System.out.println("Enter Number: ");
        int x= kb.nextInt();
        for(int y= x; y>0; y-=1)
            System.out.println("the squance " + y + " Is: " + y*x);
}
