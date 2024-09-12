/*Crie uma classe com um método que lê dois valores inteiros e distintos e informe qual é o
maior. Esse método deve ser chamado pelo método main de outra classe do mesmo projeto. */

import java.util.Scanner;
public class DescobreMaior {      // declarei classe
    public void maiorValor(){     // declarei metodo
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com dois valores: ");
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        if (valor1 > valor2) {
            System.out.println(valor1+ " é maior");
        }
        else
        System.out.println(valor2+ " é maior");
    }
}
