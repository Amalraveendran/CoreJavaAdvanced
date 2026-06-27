package com.study.chapter.four.project;

public class MesozoicEdenTaskManager {
    enum Role { FEEDER, CLEANER, SECURITY, GUIDE }

    public static String decideTask(Employee e, int hour , double safetyRating){
        if(hour <0 || hour > 23){
            return "Invalid hour provided";
        }
        if(safetyRating < 1.0){
            return "Not allowed to work";
        }
        return switch(e.getRole()){
            case FEEDER -> {
                if((hour>6 && hour <9)  && safetyRating > 3.0)
                    yield e.getName() + "Feed all herbivores and carnivores";
                else
                    yield e.getName() + "Prepare food for next feeding";
            }
            case CLEANER -> {
               if((hour > 10 && hour <12 ) && safetyRating > 4.0)
                  yield e.getName() + "Clean all enclosures and visitor areas";
               else
                    yield e.getName() + "Clean back-of-house areas and prep for next day";
            }
            case SECURITY -> {
                if((hour > 12 && hour < 18) && safetyRating > 2.0)
                    yield e.getName() + "Patrol all enclosures and visitor areas";
                else
                    yield e.getName() + "Monitor security cameras and check perimeter";
            }
            case GUIDE -> {
                if((hour > 9 && hour < 17) && safetyRating > 3.5)
                    yield e.getName() + "Lead guided tours and answer visitor questions";
                else
                    yield e.getName() + "Prepare tour materials and assist with visitor inquiries";
            }
            default -> "No task assigned";
        };
    }
    public static void main(String[] args) {
        Employee e1 = new Employee("silpa", 5, Role.FEEDER);
        Employee e2 = new Employee("aadhu", 3, Role.CLEANER);
        Employee e3 = new Employee("silja", 7, Role.SECURITY);
        Employee e4 = new Employee("amanu", 2, Role.GUIDE);

        System.out.println(decideTask(e1, 7, 0.0));
        System.out.println(decideTask(e2, 11, 4.5));
        System.out.println(decideTask(e3, 13, 3.0));
        System.out.println(decideTask(e4, 10, 3.6));
    }
}
