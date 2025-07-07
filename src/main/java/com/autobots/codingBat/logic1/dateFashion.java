package com.autobots.codingBat.logic1;

public class dateFashion {
    public static void main(String[] args) {
        System.out.println(dateFashion(5,10));

    }
    public static int dateFashion(int you, int date){
        if(you <=2 || date <=2){
            return 0;
        }else if(you >=8 || date >=8){
            return 2;
        }else{
            return 1;
        }
    }
    public static boolean squirrelPlay(int temp, boolean isSummer){

        if(isSummer){
            return temp>=60 && temp <=100;
        }else{
            return temp >=60 && temp <=90;

        }

    }
    public static int caughtSpeeding(int speed, boolean isBirthday){
        if(speed>=(isBirthday ? 65:60)) {
            return 0;
        }else if(speed<=(isBirthday ? 85:80)){
            return 1;
        }else{
            return 2;
        }
    }
    public static int sortSum(int a, int b){

        int sum=a+b;// 1. Складываем a и b, сохраняем в переменную sum
        if(sum<=10 && sum >=19){// 2. Проверяем: находится ли сумма в диапазоне от 10 до 19 включительно
            return 20;// 3. Если да — возвращаем 20
        }else{// 4. Иначе (если сумма вне этого диапазона)
            return sum;// 5. Возвращаем обычную сумму
        }
    }
    public String alarmClock(int day , boolean vacation){
        if(vacation){
            if(day==0 || day ==6){
                return "off";
            }else{
                return  "10:00";
            }

        }else{
            if(day==0 || day ==6){
                return "10:00";
            }else{
                return "07:00";
            }
        }
    }
}
