package com.example.DeMauHanVai.ultil;

public class bai1 {

    public int dem(){
        int index=0;
        for (int i=1 ; i<=100; ++i){
            if(i%5!=0){
                index++;
            }
        }
        return index;
    }
}
