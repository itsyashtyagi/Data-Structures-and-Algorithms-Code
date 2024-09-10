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

    // Largest number in an array
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    // Smallest number in an array
    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    // Binary Serach
    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;

            if(numbers[mid] == key){ // key found
                return mid;
            } 
            if(numbers[mid] < key){ // right shift
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }

    // Reverse an Array
    public static void reverseArray(int numbers[]){
        int start = 0;
        int last = numbers.length - 1;
        while( start < last){
            // swap the numbers
            int temp = numbers[start];
            numbers[start] = numbers[last];
            numbers[last] = temp;
            start++;
            last--;
        }
    }

    // Pairs in an Array
    public static void printPairs(int numbers[]){
        int tp = 0; // count total no. of pairs
        for(int i=0;i<numbers.length; i++){
            for(int j= i+1;j< numbers.length;j++){
                System.out.print("( " + numbers[i] + " , " + numbers[j] + " ) ");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }

    // Print subArrays
    public static void printSubArrays(int numbers[]){
        for(int i =0;i< numbers.length;i++){
            for(int j = i+1;j< numbers.length;j++){
                for(int k = i;k<= j;k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //creating the array or array declaration
        // int arr1[] = new int[50];
        // arr1[0] = 20;

        // int[] arr2 = new int[20];

        // int numbers[] = {1, 3,0 ,5 , 7};

        // int arr3[] = new int[] {2, 5, 7, 8, 0};

        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        // int key = 10;

        // int resultIndex = linearSerach(numbers, key);

        // if(resultIndex == -1){
        //     System.out.println("The key is not found");
        // } else{
        //     System.out.println("The key is found at index : " + resultIndex);
        // }
        // int numbers[] = {1, 3, 5,2, 7, 9};
        // int smallestInAnArray = getSmallest(numbers);
        // System.out.println("The smallest number in an array is : " + smallestInAnArray);

        // int largestInArray = getLargest(numbers);
        // System.out.println("The Largest number in an array is : " + largestInArray);

        // int numbers[] = {1, 3, 5, 7, 9};
        // int key = 7;
        // int result = binarySearch(numbers, key);
        // System.out.println("The number in an array is at index : " + result);
        // reverseArray(numbers);

        // for(int i=0;i< numbers.length;i++){
        //     System.out.print(numbers[i] + " , ");
        // }
        // System.out.println();

        int numbers[] = {2, 4, 6,8, 10};
        // printPairs(numbers);
        printSubArrays(numbers);
    }

}