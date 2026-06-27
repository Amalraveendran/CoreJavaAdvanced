package com.study.chapter.four;

public class SwitchUseCase {
    //Ex 1 Assigns value via reassignment
    public static int classicswitch(int numb){
            int returnValue = 0;
            switch(numb){
                case 1:
                    returnValue = 10;
                    break;
                case 2:
                    returnValue = 20;
                    break;
                default:
                    returnValue = -1;
            }
            return returnValue;
        }
     //Ex 2 Classic with stacked labels (fall-through to shared body)
    public static int fallThroughSwitch(int numb){
            int returnValue = 0;
            switch(numb){
                case 1:
                case 2:
                case 3:
                    returnValue = 100; // shared body for 1, 2, and 3
                    break;
                case 4:
                    returnValue = 200;
                    break;
                default :
                    returnValue = -1;
            }
            return returnValue;

    }

    //Ex 3
    public static int moderSwitchReturn(int n){
        return switch (n){
            case 1,3,5,6 -> 10;
            case 2, 4 -> 20;
            default -> -1;
        };
    }
    //Ex 4
    public static int yieldSwitch(int n){
        return switch(n){
            case 1,3,5 -> {
                System.out.println("Odd yeild ");
                yield 3;
            }
            case 2,4,6 ->{
                System.out.println("Even yield ");
                yield 2;
            }
            default -> {
                System.out.println("Defualt switch ");
                yield -1;
            }
        };
    }

    //Ex 5 Arrow no return
    public static void arrowNoReturnSwitch(int n){
        switch(n){
            case 1,2 -> System.out.println("Hello..");
            case 3,4 -> {
                System.out.println("hey");
                System.out.println("hi..");
            }
            default -> System.out.println("Default case...");
        }
    }
}
