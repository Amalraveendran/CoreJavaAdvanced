package com.study.chapter.five.project;

public class DinaMealPlanner  {
    public static void planMeals() {
        for(int time = 0; time<=23;time++){
            if( time == 8 || time ==12 || time == 20){
                int tRExCal = 100;
                System.out.println("Time is : " +time + "T-Rex should feed " + tRExCal + " calories");
            }
            if( time == 7 || time ==11 || time == 15 || time == 19){
                int brachio = 250;
                System.out.println("Time is : " +time + "Brachiosauraus should feed " + brachio + " calories");
            }
        }

    }
    public static void main(String[] args) {
       planMeals();
    }
}
