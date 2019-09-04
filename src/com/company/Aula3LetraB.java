package com.company;


import java.util.Scanner;

public class Aula3LetraB {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int pecasProduzidas, pecasDefeituosas;
     System.out.println("Informe a quantidade de peças produzidas");
     pecasProduzidas = sc.nextInt();
     System.out.println("Informe a quantidade de peças defeituosas");
     pecasDefeituosas = sc.nextInt();
     if(pecasDefeituosas > (pecasProduzidas * 0.1)) {
         System.out.println("Máquina precisa de manutenção");
     }else{
             System.out.println("Máquina não precisa de manutenção");
         }
     }

    }
