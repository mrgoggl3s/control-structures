package com.ideofit;

public class Main {

    public static void main(String[] args) {
        int nat = 7;
        String diez = "";

//        while(diez.length()  < nat  ){
//            diez = diez +"#";
//        }
//        System.out.println(diez);

        
        for (int i = 0; i <nat  ; i++) {
            diez = diez + "#";
        }
        System.out.println(diez);

    }
}
