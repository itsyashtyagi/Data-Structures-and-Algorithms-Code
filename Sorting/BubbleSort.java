package Sorting;

public class BubbleSort {
    public static void ascendingSort(int arr[]){
        for(int i=0;i<arr.length -1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void descendingSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] < arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 5, 7, 9, 3};
        // ascendingSort(arr);
        // // print ascending array
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        descendingSort(arr);

        //print descending array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
