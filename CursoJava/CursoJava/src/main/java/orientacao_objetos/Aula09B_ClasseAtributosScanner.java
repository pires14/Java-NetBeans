package orientacao_objetos;

import java.util.Scanner;

public class Aula09B_ClasseAtributosScanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Carro09 MeuCarroNovo = new Carro09();
        
        System.out.println("==== Cadastro de veículo:");
        System.out.println("Digite o modelo do carro: ");
        MeuCarroNovo.modelo = teclado.nextLine();
        System.out.println("Digite a cor do carro:");
        MeuCarroNovo.cor = teclado.nextLine();
        System.out.println("Digite o ano do carro:");
        MeuCarroNovo.ano = teclado.nextInt();
        System.out.println("Carro criado:\n" + MeuCarroNovo.modelo +"\nCor do carro:"+ MeuCarroNovo.cor + "\nAno do carro:"+ MeuCarroNovo.ano);
        teclado.close();
    }
}