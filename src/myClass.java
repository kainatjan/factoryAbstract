import java.util.Scanner;


public class myClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res= sc.next();
        ProductFactory pr= new ProductFactory();
        pr.gotoFac(res);
    }
    }
