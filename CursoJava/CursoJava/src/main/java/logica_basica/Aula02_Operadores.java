/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica_basica;

/**
 *
 * @author edsonalves
 */
public class Aula02_Operadores {
    public static void main(String[] args){
        double nota1 = 8.0;
        double nota2 = 9.0;
        double media = (nota1 + nota2)/2;
        if(media >=7.0){
            System.out.println("Média das notas:" + media);
            System.out.println("O aluno passou!");
        }
        else{
            System.out.println("O aluno reprovou");
        }
    }
}
