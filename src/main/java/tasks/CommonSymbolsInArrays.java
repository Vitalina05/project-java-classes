package tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonSymbolsInArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,2,2,2,3,4,5,3,2,4,6,42,1,13,4,7,9};
        int [] arr2 = {7,5,3,6,6,2,2,3,63,2,7,23,1,1,4,0,9};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList result = new ArrayList();
        int i =0 ;
        int j =0;
        while(i< arr1.length && j<arr2.length){
            if (arr1[i]>arr2[j]){
                j++;

            }else if (arr1[i]<arr2[j]){
                i++;

            }else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.println("Common symbols in two arrays:" + result);
    }
}
