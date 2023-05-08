
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        
        int[] numbers2 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 1, 0);
        System.out.println(Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 0, 3);
        System.out.println(Arrays.toString(numbers2)); 
        int[] numbers3 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers3);
    }
    public static void sort(int[] array){
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(Arrays.toString(array));
            swap(array,i,indexOfSmallestFrom(array ,i));
        }
          
    }
    
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static int smallest(int[] array){
        int smallest = 999999999;
        for (int i = 0 ; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = 999999999;
        int index = -1;
        for (int i = 0 ; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                index= i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array,int loc){
        int smallest = 999999999;
        int index = -1;
        for (int i = loc ; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                index= i;
            }
        }
        return index;
    }

}
