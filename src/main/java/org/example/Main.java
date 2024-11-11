package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,-1));
        System.out.println("Yaş kontrolü: " + hasTeen(12, 29, 42));
         System.out.println("Kedi Oynuyor mu ?"+isCatPlaying(false, 36));
        System.out.println("Dikdörtgenin alanı:"+area(-1.0, 4.0));
        System.out.println("Dairenin alanı:"+area(5.0));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if(clock<0 || clock>23){
            return false;
        }
        if(isBarking&&(clock<8||clock>=20)){
            return true;
        }
        return false;


    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if(13<=firstAge && firstAge<=19 || 13<=secondAge && secondAge<=19 || 13<=thirdAge&&thirdAge<=19){
        return true;
       }
       return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(!isSummer&&(temp>=25 &&temp<=35)){
            return true;
        }
        if(isSummer&&(temp>=25&&temp<=45)){
            return true;
        }
        return false;
    }

    public static double area(double width, double height) {

        if(width<0||height<0){
            return -1;
        }
        double result=width*height;
        return result;

    }

    public static double area(double radius) {
       if(radius<0){
           return -1;
       }
       double result=radius*radius*Math.PI;
       return result;
    }
}
