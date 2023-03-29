public class ArrayAverage {
 
    public static void main(String[] args) {
 
        
        int[] array = { 16,18,27,16,23,21,19 };
 
        
        int length = array.length;
 
        
        int sum = 0;
 
        
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
 
        double average = sum / length;
         
        System.out.println("Average of array : "+average);
 
    }
 
}


