package com.autobots.codingBat.string1.string1;

public class nTwice {
    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));
        System.out.println(twoChar("java", 0));
    }

   public static String nTwice(String str, int n){
        String s="Hello";
        String firstN=s.substring(0,n);
        String lastN=s.substring(str.length()-n);
        String result=firstN+lastN;


      return result;
   }
   public static String twoChar(String str, int index) {
       if (index >= 0 && index + 1 < str.length()) {
           return str.substring(index, index + 2);// // если влезает
       } else {
           return str.substring(0, 2); // иначе — первые два символа

       }
   }





}
