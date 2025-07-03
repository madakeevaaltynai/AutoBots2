package com.autobots.codingBat.string1.warmup2;

public class countXX {
    public static void main(String[] args) {
        System.out.println(countXX("xx"));
        System.out.println(countXX("abcxx"));

    }
    public static int countXX(String str){
        //
        int count=0;
        //str.length() - 1 — потому что мы будем смотреть i и i+1 символ,
        // и i+1 не должен выйти за границу строки.
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)=='x'&&str.charAt(i+1)=='x'){
                count++;
            }
        }
        return count;
    }
}
