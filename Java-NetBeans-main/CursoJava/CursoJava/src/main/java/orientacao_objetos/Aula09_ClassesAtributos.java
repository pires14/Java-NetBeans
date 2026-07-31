/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacao_objetos;

/**
 *
 * @author edsonalves
 */


public class Aula09_ClassesAtributos {
    public static void main(String[] args) {
        Carro09 meuCarro = new Carro09();
        meuCarro.modelo = "Corolla";
        meuCarro.cor = "preto";
        meuCarro.ano = 1980;
        
        System.out.println("Carro criado:" + meuCarro.modelo);
        System.out.println("Cor do carro:"+ meuCarro.cor);
        System.out.println("Ano do carro:" + meuCarro.ano);
        
    }
    
}