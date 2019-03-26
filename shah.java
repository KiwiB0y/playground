package com.company;

public class shah {

    public static void main(String[] args) {

        int k = 1;
        while (k < 18){
            System.out.print('-');
            k++;
        }
        System.out.println();


        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                if ((i+j) % 2 == 0){
                    System.out.print("| ");
                } else {
                    System.out.print("|*");
                }

            }
            System.out.println("|");
        }

        k = 1;
        while (k < 18){
            System.out.print('-');
            k++;
        }




    }


}
