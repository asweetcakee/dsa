package example.algorithms.sorting;

import java.util.List;

import example.interfaces.SortingInterface;

public class InsertionSort implements SortingInterface {

    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Insertion sort");
        int size = numbers.size();

        for (int i = 1; i < size; i++) {

            int currentVal = numbers.get(i);
            int j = i - 1;

            while (j >= 0 && numbers.get(j) > currentVal) {
                numbers.set(j + 1, numbers.get(j));
                j--;
            }

            numbers.set(j + 1, currentVal);
        }
    }

}
