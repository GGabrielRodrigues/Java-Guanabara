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
        System.out.printf("É casado? (true ou false): ");
        boolean casado = leitor.nextBoolean();
        leitor.nextLine();
        System.out.print("Insira o caracter: ");
        char caractere = leitor.next().charAt(0);
        leitor.nextLine();
        System.out.print("Insira a sua nacionalidade: ");
        String nacionalidade = leitor.nextLine();
        System.out.print("Insira a sua idade: ");
        byte idade = leitor.nextByte();
        System.out.print("Insira o seu DDD: ");
        short DDD = leitor.nextShort();
        System.out.print("Insira o seu ano de nascimento: ");
        int ano = leitor.nextInt();
        System.out.print("Insira o seu CPF: ");
        long CPF = leitor.nextLong();
        System.out.print("Insira a sua altura (cm): ");
        float altura = leitor.nextFloat();
        System.out.print("Comprimento da unha (mm): ");
        double unha = leitor.nextDouble();
        
        //
        System.out.println("\nCasado: "+ casado + "\nCaractere inserido: " + caractere + "\nNacionalidade: " + nacionalidade);
        System.out.println("Idade: " + idade + "\nDDD: " + DDD + "\nAno: " + ano + "\nCPF: " + CPF + "\nAltura: " + altura);
        System.out.println("Comprimento da unha: " + unha);
        
        
        
       
    }
    
}
