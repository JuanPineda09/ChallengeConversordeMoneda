import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);


        ConsultaMoneda consultaMoneda = new ConsultaMoneda();

        HashMap<Integer, String> origenDeMoneda = new HashMap<Integer, String>();
        origenDeMoneda.put(1,"USD");
        origenDeMoneda.put(2,"COP");
        origenDeMoneda.put(3,"EUR");
        origenDeMoneda.put(4,"BRL");
        origenDeMoneda.put(5,"KRW");
        origenDeMoneda.put(6,"RUB");
        origenDeMoneda.put(7,"ZAR");
        origenDeMoneda.put(8,"JPY");
        origenDeMoneda.put(0,"SALIR");

        System.out.println("¡Bienvenido!");

        while (true) {
            System.out.println("Por favor selecciona la el tipo de moneda que quieres convertir...\n" +
                    "1 - Dolar Estadounidense\n" +
                    "2 - Peso Colombiano\n" +
                    "3 - Euro\n" +
                    "4 - Real Brasileño\n" +
                    "5 - Won Surcoreano\n" +
                    "6 - Rublo ruso\n" +
                    "7 - Rand sudafricano\n" +
                    "8 - Yen Japones\n" +
                    "0 - Salir del Programa"
            );

            Integer divisa1 = sc.nextInt();
            if (divisa1 == 0){break;}
            System.out.println("Por favor ingre el valor en " + origenDeMoneda.get(divisa1));
            Double entradaValor = sc.nextDouble();
            System.out.println("Por favor selecciona la el tipo de moneda al cual convertiras el valor enviado...\n" +
                    "1 - Dolar Estadounidense\n" +
                    "2 - Peso Colombiano\n" +
                    "3 - Euro\n" +
                    "4 - Real Brasileño\n" +
                    "5 - Won Surcoreano\n" +
                    "6 - Rublo ruso\n" +
                    "7 - Rand sudafricano\n" +
                    "8 - Yen Japones\n" +
                    "0 - Salir del Programa"
            );
            Integer divisa2 = sc.nextInt();
            if (divisa2 == 0){break;}
            Moneda moneda = consultaMoneda.buscaMoneda(origenDeMoneda.get(divisa1), origenDeMoneda.get(divisa2));
            System.out.println(origenDeMoneda.get(divisa2) + " " + moneda.conversion_rate() * entradaValor +"\n"+
                    "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        }
        System.out.println("¡El programa ha finalizado!");
    }
}