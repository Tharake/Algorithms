/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class MergeSort {
    
    private char Arr[] =  {'E','X','A','M','P','L','E'};
    private int n = Arr.length;
    private char tempArr[] = new char[Arr.length];
    
public static void main(String []arg){
    MergeSort asd = new MergeSort();
    asd.Sort(0,asd.n-1);
    asd.Display();
}


//Method for Sorting

    private void Sort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            Sort(lowerIndex, middle);
            // Below step sorts the right side of the array
            Sort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    
    //Method for Merging 
    
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempArr[i] = Arr[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempArr[i] <= tempArr[j]) {
                Arr[k] = tempArr[i];
                i++;
            } else {
                Arr[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            Arr[k] = tempArr[i];
            k++;
            i++;
        }
 
    }

 //Method for Displaying Array
  
    private void Display(){
    for(int i=0;i<n;i++){
    System.out.print(Arr[i]+" ");
    }
}
}