/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao_objetos;

/**
 *
 * @author edsonalves
 */
public class Aula10_MetodosRetorno {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        double valorAtual = minhaConta.verificarSaldo();
        System.out.println("---------------------------");
        System.out.println("Saldo atual: R$"+ valorAtual);
        
    }
}
