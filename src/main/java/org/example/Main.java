package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> result = new ArrayList<>();

        for (T item : list) {

            if (!result.contains(item)) {
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);

        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println(uniqueNumbers);
    }
}