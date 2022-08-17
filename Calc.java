/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calc;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Calc {

    public static void main(String[] args) {
        System.out.println("CALCULADORA!- FUNCIONANDO BIEN");
         System.out.println("CALCULADORA!- FUNCIONANDO BIEN");
         System.out.println("CALCULADORA!- FUNCIONANDO BIEN");
         System.out.println("CALCULADORA!- FUNCIONANDO BIEN");
        // Se crea un objeto de la clase calculadora
        Calculadora cal=new Calculadora();
        //leemos los datos de entrada
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar los numeros que desea: ");
        
        int resultado=cal.suma(leer.nextInt(),leer.nextInt());
        System.out.println("El resultado de la suma es "+ resultado);
        
        int resultado2=cal.resta(leer.nextInt(),leer.nextInt());
        System.out.println("El resultado de la resta es "+ resultado2);
        
        
        
    }
    
    public int suma(int a, int b){
        int sum=0;
        if(a>0 && b> 0)
            sum=a+b;
        return sum;
    }
}


