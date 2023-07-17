import java.util.Arrays;
import java.util.Scanner;
/**
 * Exercicio3
 */

public class Exercicio3 {
    public static void main(String[] args){
        System.out.println("Digite o tamanho do array: ");
        Scanner input = new Scanner(System.in);
        int tamanho = input.nextInt();
        int[] arr = new int[tamanho];
        int count = 0;
        System.out.println("Insira valores no array: ");
        for(int i = 0; i < arr.length; i++){
            int value = input.nextInt();
            arr[i] = value;
        }

        System.out.println("Digite a diferença alvo: ");
        int diff = input.nextInt();

        for(int i = 0; i < arr.length; i++){
            for(int a = 0; a < arr.length; a++){
                if(arr[i] - arr[a] == diff){
                    count++;
                }
            }
        }
        System.out.println("QUANTITATIVO DE VALORES CUJA DIFERENÇA É IGUAL AO VALOR ALVO:");
        System.out.println(count);   
    }
}