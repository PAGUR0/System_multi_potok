package com.company;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args){

        OneInput[] oneInput = new OneInput[10];

        for(int i = 0; i < 10; i++){
            oneInput[i] = new OneInput();
        }

        for(int i = 0; i < 10; i++){
            oneInput[i].start();
        }
    }
}

