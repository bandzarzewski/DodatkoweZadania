package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sito {
    private boolean tab[];
int n;
//    int n=100;
    public Sito() {
        tab = new boolean[n];
    }
    public Sito(int n){
        this.n=n;
        tab = new boolean[n];
    }

    public void generujSito(){

        Arrays.fill(tab,true); // Ustawienie wszystkich wartosci od 2 na true
        tab[0]=false;
        tab[1]=false;

        for(int i=2;i<n;i++){
            if(tab[i]==true){ // analizujemy wszystki liczny które sa true
                for (int j = i+i; j < n; j=j+i) {
                tab[j]=false;
                }
            }
        }
    }
    public void drukujSito(){
        for (int i = 0; i <tab.length ; i++) {
            if (tab[i]) {
                System.out.println(i);
            }
        }
    }

}
