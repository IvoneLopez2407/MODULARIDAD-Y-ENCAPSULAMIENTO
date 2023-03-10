/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areaspoo;
import javax.swing.JOptionPane;

public class Areas {    
    double base = 0.0;
    double altura = 0.0;
    double radio = 0.0;
    double pi = 3.1416;

    public Areas() {
    }
    public Areas (double base, double altura, double radio) {
        this.base = base;
        this.altura = altura;
        this.radio = radio;
        this.pi = 3.1416;
    } 
    public void solicitarDatos(){
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite la base"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura"));
        radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio"));   
    }
    public double calcularAreaCuadrada(){
        return base * altura;
    }
    public double calcularAreaCirculo(){
        return pi * (radio * radio);
    }
    public void Imprimir(){
        JOptionPane.showMessageDialog(null, "El area del Cuadrado es: "+calcularAreaCuadrada());
        JOptionPane.showMessageDialog(null, "El area del Circulo es: "+calcularAreaCirculo());
    }
}