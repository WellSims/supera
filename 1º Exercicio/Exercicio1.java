import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Exercicio1
 */
public class Exercicio1 {

    public static void main(String[] args) {

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Integer totaldeIteracoes = null;
        Integer i = 0;
        boolean alternador;

        do {
            if (totaldeIteracoes == null) {
                totaldeIteracoes = scanner.nextInt();
            } else {
                Integer numero = scanner.nextInt();
                if (numero % 2 == 0) {
                    pares.add(numero);
                } else {
                    impares.add(numero);
                }
                i++;
            }
        } while (i < totaldeIteracoes);

        for (int a = 0; a < pares.size() - 1; a++) {
            alternador = false;
            for (int j = 0; j < pares.size() - a - 1; j++) {
                if (pares.get(j) > pares.get(j + 1)) {
                    int temp = pares.get(j);
                    pares.set(j, pares.get(j + 1));
                    pares.set(j + 1, temp);
                    alternador = true;
                }
            }
            if (!alternador) {
                break;
            }
        }

        for (int a = 0; a < impares.size() - 1; a++) {
            alternador = false;
            for (int j = 0; j < impares.size() - a - 1; j++) {
                if (impares.get(j) < impares.get(j + 1)) {
                    int temp = impares.get(j);
                    impares.set(j, impares.get(j + 1));
                    impares.set(j + 1, temp);
                    alternador = true;
                }
            }
            if (!alternador) {
                break;
            }
        }

        for (Integer par : pares) {
            System.out.println(par);
        }
        for (Integer impar : impares) {
            System.out.println(impar);
        }
    }
}