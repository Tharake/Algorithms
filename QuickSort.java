/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class QuickSort {
    
    private int arr[] = {3,41,52,26,38,57,9,49,16}; 
    private int n= arr.length;
    
public static void main (String arg[]){
    
    QuickSort asd = new QuickSort();
    asd.Sort(asd.arr, 0, asd.n-1);
    asd.Display();

}

// Method for Array Partitioning

public int Partition (int arr[],int low,int high){

int pivot = arr[high];
int j=low-1;
for (int i=low;i<high+1;i++){
    if(arr[i]<=pivot){
        
        j++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
    
    return j;
}

// Method for Sorting

public void Sort (int arr[],int low,int high){
    
    if(low<high){
        
        int pivot = Partition(arr,low,high);
        Sort(arr,low,pivot-1);
        Sort(arr,pivot+1,high);
    }
 
}

// Method for Displaying Array
public void Display(){
    for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
    }



}
 
}




