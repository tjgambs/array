package array;
public class runner 
{  
     
    public static void main(String[] args) {
         
        Statistics stats = new Statistics();
        System.out.println("Initial array: " + stats.toString());
        stats.insertionSort();
        System.out.println("Sorted array: " + stats.toString());
        System.out.println("Min: " +stats.min());
        System.out.println("Max: " +stats.max());
        System.out.println("Average: " + stats.average());
        System.out.println("Mode: " + stats.mode());
        System.out.println("Number of times mode appears: " + stats.numTimesMode());
        System.out.println("Median: " + stats.median());
        System.out.println("Is 6 in the array?: " + stats.findint_linear(6));
        System.out.println("Is 6 in the array?: " + stats.findint_binary(6));
        
    }
}

