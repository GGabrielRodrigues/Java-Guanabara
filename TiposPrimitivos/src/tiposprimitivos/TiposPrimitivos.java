/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        float nota = leitor.nextFloat();
        System.out.printf("A nota de %s é: %.2f", nome, nota);
    }
    
}
