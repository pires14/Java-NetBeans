/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao_objetos;

/**
 *
 * @author edsonalves
 */
import java.util.Scanner;
public class Aula10B_MetodosRetornoScanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta minhaConta = new Conta();
        System.out.println("---Método de Saque---");
        System.out.println("Saldo atual da conta:" + minhaConta.verificarSaldo());
        System.out.println("Digite o valor que você deseja sacar: R$");
        double valorSaque = teclado.nextDouble();
        minhaConta.sacar(valorSaque);
        System.out.println("Saldo atual é de: "+ minhaConta.verificarSaldo());
    }
}
