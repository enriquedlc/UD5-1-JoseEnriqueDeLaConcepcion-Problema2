import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        GenericStack<Integer> listaNumeros = new GenericStack<Integer>();

        listaNumeros.push(scan.nextInt());
        listaNumeros.push(scan.nextInt());
        int numeroIntroducido = listaNumeros.pop();

        System.out.println(numeroIntroducido);


    }
}
