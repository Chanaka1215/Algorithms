package tests;

import common.AlgorithmType;
import common.BaseTestRunner;

public class ValidMountainArray extends BaseTestRunner {
    @Override
    public void run() {
        printDetails();
        int array[] = new int[]{1, 2, 3 ,5,4,3,2};
        int length = array.length;
        boolean validMountain = true;

        //First check 2 ends. First and last should not be larger
        if((array[0] > array[1]) || array[length-1] > array[length -2]){
            validMountain = false;
            return;
        }

        //Then find the peak index
        int peakIndex =0;
        for (int i = 1; i <array.length-1; i ++){
            if(array[i] > array[i-1] && array[i] > array[i+1]){
                peakIndex = i;
                break;
            }
        }

        //From the peak go one by one
        for (int j = peakIndex; j < array.length-1; j++){
            if(array[j] < array[j+1]){
                validMountain = false;
                break;
            }

        }

        System.out.println("Is a valid mountain ? :: " + validMountain);
    }

    @Override
    public AlgorithmType getId() {
        return AlgorithmType.VALID_MOUNTAIN_ARRAY;
    }
}
