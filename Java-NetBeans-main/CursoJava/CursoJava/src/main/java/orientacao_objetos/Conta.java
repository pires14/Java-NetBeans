/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao_objetos;

/**
 *
 * @author 3tecnico
 */
public class Conta {
    double saldo = 850.0;//Para retornar o saldo:
    double verificarSaldo (){
        return saldo;
    }
    void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de: R$"+ valor + "realizado!");
        }else{
            System.out.println("Saque de: R$"+ valor+ "não foi realizado! Saldo insuficiente");
        }
        
    }
}
