import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        Integer valor = sc.nextInt();


        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        Moneda moneda = consultaMoneda.buscaMoneda("COP","USD");


        System.out.println(moneda.conversion_rate()*valor);
    }
}