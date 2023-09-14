package com.company;

public class OneInput extends Thread {

    private static int num;
    int n;

    OneInput(){
        num++;
        n = num;
    }
    
    public void run() {
        System.out.println("Поток " + this.n + " запущен");
        System.out.println("Поток " + this.n + " завершен");
    }
}
