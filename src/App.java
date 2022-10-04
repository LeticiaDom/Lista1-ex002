import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); 
        sc.close();
        System.out.println("O numero digitado foi: " + n1); 
    }
}
