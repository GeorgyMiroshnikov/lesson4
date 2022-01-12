package com.company;

public class leeson4 {
}

class Solution {
    public static void main(String[] args) {

        int year = 1980;
        for (int j= 0; j<6; j++){
            System.out.println(year++ + " год");
        }

        //МАССИВЫ
        int [] araiV1 = new int [5];
        System.out.println(araiV1[4]);
        araiV1 [3] = 67;
        for (int j = 0; j < araiV1.length; j++) {
            System.out.println(araiV1[j]);
        }



            int[] araiV2 = new int[] {22, 15, 66 , 24 , 65};
        System.out.println(araiV2[4]= 28);

        for (int j = 0 ; j<araiV2.length; j++){
            System.out.println(araiV2[j]);
        }

        int[] araiV3 = new int[] {555, 3, 976 , 33 , 33};

//foreach

        for (int item : araiV3){

            System.out.println(item);
        }








    }
}