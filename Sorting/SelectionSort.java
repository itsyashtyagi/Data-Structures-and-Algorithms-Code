package Sorting;

public class SelectionSort {
    public static void ascendingSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void descendingSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int largest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > arr[largest]){
                    largest = j;
                }
            }
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {7, 8 , 3, 1, 2};

        // ascendingSort(arr);
        // //print
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        descendingSort(arr);
        //print
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
