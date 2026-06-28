package com.study.chapter.six.project;

public class DinoTracker {
    public static void main(String[] args) {
        String[] dinoNames = new String[3];
        int[] dinoAges = new int[3];
        String[] dinoSpecies = new String[3];
        String[] dinoEnclosures = new String[3];
        double[] dinoWeight = new double[3];
        int totalAge = 0;
        double totalWeight = 0.0;
        int averageAge = 0;
        double averageWeight = 0.0;

        //add values
        dinoNames[0] = "dino1";
        dinoAges[0] = 5;
        dinoSpecies[0] = "Species1";
        dinoEnclosures[0] = "Enclosure1";
        dinoWeight[0] = 100.5;

        dinoNames[1] = "dino2";
        dinoAges[1] = 6;
        dinoSpecies[1] = "Species2";
        dinoEnclosures[1] = "Enclosure2";
        dinoWeight[1] = 150.7;

        dinoNames[2] = "dino3";
        dinoAges[2] = 7;
        dinoSpecies[2] = "Species3";
        dinoEnclosures[2] = "Enclosure3";
        dinoWeight[2] = 200.9;

        for(int i = 0; i < dinoSpecies.length;i++){
            System.out.println("Dino Name: " + dinoNames[i]);
            System.out.println("Dino Age: " + dinoAges[i]);
            System.out.println("Dino Species: " + dinoSpecies[i]);
            System.out.println("Dino Enclosure: " + dinoEnclosures[i]);
            System.out.println("Dino Weight: " + dinoWeight[i]);
            System.out.println();
        }

        for(int i = 0; i<dinoAges.length;i++){
            totalAge += dinoAges[i];
            totalWeight = totalWeight + dinoWeight[i];
        }
        System.out.println("Total Age: " + totalAge);
        System.out.println("Total Weight: " + totalWeight);

        averageAge = totalAge/dinoAges.length;
        averageWeight = totalWeight/dinoWeight.length;
        System.out.println("Average Age: " + averageAge);
        System.out.println("Average Weight: " + averageWeight);
    }
}
