package sorting;

import java.util.Random;
import java.util.Scanner;

public class AllSort {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to AllSort.\n");

        int[] data = generate_random_array(r, sc);

        System.out.println("Please choose an algorithm: ");
        String[] algorithms = {"Selection ", "Bubble ", "Insertion ", "Merge ", "Quick", "Random Quick", "Counting", "Radix"};
        for(int i = 0; i < algorithms.length; i++)
            System.out.println((i+1) + ". " + algorithms[i] + "sort");

        System.out.print("\nEnter a number: ");
        data = sort(data, sc.nextInt());

        print_array(data);

    }
    public static int[] sort(int[] data, int type){
        return switch(type){
            case 1 -> selection_sort(data);
            case 2 -> bubble_sort(data);
            case 3 -> insertion_sort(data);
            case 4 -> merge_sort(data);
            case 5 -> quicksort(data);
            case 6 -> random_quicksort(data);
            case 7 -> counting_sort(data);
            case 8 -> radix_sort(data);
            default -> null;
        };
    }

    public static int[] generate_random_array(Random r, Scanner sc){
        System.out.print("Please enter the size of your random array: ");
        int size = sc.nextInt();
        System.out.print("Please enter the range of random numbers: ");
        int range = sc.nextInt();
        int[] data = new int[size];
        System.out.println("Array creation successful.\n");
        System.out.print("Random data array: ");

        for(int i = 0; i < data.length; i++){
            data[i] = r.nextInt(range);
            System.out.print(data[i] + "   ");
        }
        System.out.println("\n");
        return data;
    }

    public static void print_array(int[] data){
        System.out.print("Sorted array: ");
        for(int i: data)
            System.out.print(i + "   ");
        System.out.println();
    }



    public static int[] bubble_sort(int[] data){
        int temp;
       for (int i = 0; i < data.length - 1; i++ ) {
        for(int j = 0; j < data.length - i - 1 ; j++){
            if(data[j] > data[j + 1]){
                temp = data[j];
                data[j] = data[j + 1];
                data[j + 1] = temp;


            }

        }
           
       }

        return data;
    }

    public static int[] selection_sort(int[] data){
        
        return data;
    }

    public static int[] insertion_sort(int[] data){

        for (int i = 1 ; i < data.length ; i++) {

            int temp = data[i];
            int j = i-1;

           
           
            while (j>= 0 && temp < data[j]) { 
                data[j +1] = data[j];

                j--;
                
            }
            data[j + 1] = temp;
           
            }
            for(int i : data){
               
               
        }
        return data;
        // to do

    }




    public static int[] merge_sort(int[] data){
        // to do
        return data;
    }

    public static int[] quicksort(int[] data){
        //to do
        return data;
    }

    public static int[] random_quicksort(int[] data){
        //to do
        return data;
    }

    public static int[] counting_sort(int[] data){
        //to do
        return data;
    }

    public static int[] radix_sort(int[] data){
        //to do
        return data;
    }
}
