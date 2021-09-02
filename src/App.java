import java.util.Scanner;

/**
 * @author Blenda Guedes
 * @version 0.0.1
 */

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        String palavra = sc.nextLine();
        System.out.println(palavra);
        palavra = null;
        palavra.isEmpty();
    }
}
