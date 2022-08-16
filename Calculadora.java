/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calc;

/**
 *
 * @author admin
 */
public class Calculadora {
    //SUMA
    public int suma(int a, int b){
        int sum=0;
        if(a>0 && b> 0)
            sum=a+b;
        return sum;
    }
    
    public int resta(int a, int b){
        int res=0;
        if(a>0 && b> 0)
            res=a-b;
        return res;
    }
    
    
}
