/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula09;
import java.util.Scanner;

/**
 *
 * @author jvict
 */

public class ArCondicionado {
    private int potencia;
    private boolean ligado;
    
    public ArCondicionado(){
        this.potencia = 0;
        this.ligado = false;
    }
    
    public int getPotencia(){
        return this.potencia;
    }
    
    public void setPotencia(int potencia){
        if (potencia >=0 && potencia <=6){
            this.potencia = potencia;
        this.ligado=true;
        } else { 
        System.out.println("Potência invalida! O ar foi desligado.");
        this.ligado=false;
        
        }
    }
    
    public void aumentarAr(){
        if (this.potencia >= 6){
            this.ligado=true;
            System.out.println("O ar já está em sua potência máxima!");
        } else{
        this.potencia += 1;
        this.ligado=true;
        System.out.println("Potência: " + this.potencia);
        }
    }
    
    public void diminuirAr(){
        if (this.potencia <= 0){
            System.out.println("O ar já está desligado!");
            this.ligado = false;
        } else {
        this.potencia -= 1;
        if (this.potencia >0){
            this.ligado=true;
            }
        }
    }   
    
    public void desligarAr(){
        if (this.potencia <= 0){
            System.out.println("O ar já está desligado!");
            this.ligado = false;
        } else {
        this.potencia = 0;
            this.ligado=false;
            }
    } 
    
    public void status() {
            System.out.println("\n\nSituação: \nO Ar Condicionado está (true = Ligado // false: Desligado): " + this.ligado);
            System.out.println("O Ar está na potência: " + this.potencia);
        }
    }
