package com.company;

import java.util.Scanner;

public class Aula3LetraC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a idade: ");
        int idade = sc.nextInt();
        if(idade<=10) {
            System.out.println("Infantil");
        }else if(idade > 10 && idade <=17) {
            System.out.println("juvenil");
        }else
            {System.out.println("senior");
        }
    }
}
