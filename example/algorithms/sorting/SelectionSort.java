package example.algorithms.sorting;

import java.util.List;

import example.interfaces.SortingInterface;

public class SelectionSort implements SortingInterface {

    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Selection sort");
        int size = numbers.size();
        for (int i = 0; i < size - 1; i++) {

            int foundAtIndex = i;
            int minValue = numbers.get(i);
            boolean swapped = false;

            for (int j = i + 1; j < size; j++) {
                int next = numbers.get(j);
                if (next < minValue) {
                    minValue = next;
                    foundAtIndex = j;
                    swapped = true;
                }
            }

            if (foundAtIndex != i) {
                int temp = numbers.get(i);
                numbers.set(i, minValue);
                numbers.set(foundAtIndex, temp);
            }
            if (!swapped) {
                break;
            }
        }
    }

}
