package example.algorithms.sorting;

import example.interfaces.SortingInterface;
import java.util.List;

public class BubbleSort implements SortingInterface {

    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Bubble sort");
        int size = numbers.size();
        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                int first = numbers.get(j);
                int next = numbers.get(j + 1);
                if (first > next) {
                    numbers.set(j, next);
                    numbers.set(j + 1, first);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

}
