public class Arrays{

    // Linear Search
    public static int linearSerach(int numbers[], int key){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key){
                return i;
            }
        } 
        return  -1;
    }
    public static void main(String[] args) {
        //creating the array or array declaration
        // int arr1[] = new int[50];
        // arr1[0] = 20;

        // int[] arr2 = new int[20];

        // int numbers[] = {1, 3,0 ,5 , 7};

        // int arr3[] = new int[] {2, 5, 7, 8, 0};

        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10;

        int resultIndex = linearSerach(numbers, key);

        if(resultIndex == -1){
            System.out.println("The key is not found");
        } else{
            System.out.println("The key is found at index : " + resultIndex);
        }
    }
}