package com.study.chapter.five;

public class NestedIf {
    public static void main(String[] args) {
        //Ex 1
      /*  int[] num = {3, 2, 5, 4};
        for (int i = 0; i < num.length; i++) {
            for(int j = 1; j<=num[i];j++){
                System.out.print("&");
            }
            System.out.println();

        }*/

        //Ex 2
        /*for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i ;j++){
                System.out.print( "*");
            }
            System.out.println();
        }*/

        //Ex 3 break
        /*for(int i = 1; i<=5;i++){
            for(int j = 1; j<=5;j++){
                if(j==4)
                    break;
                System.out.println(i + " "+j);
            }
        }*/

        //Ex 4 labelled break
       /* Outerloop:
        for(int i = 1; i<=5; i++){
            for(int j = 1 ; j<=5; j++){
                if(j == 4)
                    break Outerloop; // this breaks the outerloop and exits the loop completely
                System.out.println(i + " "+j);
            }
            System.out.println("Exit");
        }*/

        //EX 5 continue
        /*for(int i = 1;i<=5;i++){
            for(int j= 1; j<=5;j++){
                if(j==4)
                    continue; // this will skip the current iteration of the inner loop and continue with the next iteration
                System.out.println(i + " "+j);
            }
        }*/
        //Ex 6 labelled continue
        innerloop:
        for(int i = 1; i<=5; i++)
            for(int j = 1; j<=5;j++){
                if(j==3)
                    continue innerloop; /* this will skip the current iteration of the inner loop
                                           and continue with the next iteration of the outer loop.
                                           Ideally it should have skipped j=3 and should've continued with executing j = 4,5.
                                            Instead, it skipped that part and skipped the current iteration outerloop completly and started with another*/
                System.out.println(i + " "+j);
            }

    }
}
