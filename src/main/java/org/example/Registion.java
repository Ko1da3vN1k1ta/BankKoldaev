package org.example;

import java.util.Scanner;

public class Registion {
    Scanner cr = new Scanner(System.in);
    public void menu(){
        System.out.println("Что вы хотите сделать?");
        System.out.println("1-Зарегистрироваться");
        System.out.println("2-Войти");
        int metod = cr.nextInt();
        if (metod==1){
            System.out.println("Введите номер тедефона: ");
            numberPhone();
            System.out.println("Придумайте пароль: ");
        }else if (metod==2){
            System.out.println("");
        }
    }
    public void registion(){

    }
    public void numberPhone(){
        System.out.println("+");
        long numberPhone = cr.nextInt();

    }
    public void pasword(){
        int pasword = cr.nextInt();

    }
}
