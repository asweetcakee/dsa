package example.app;

import example.utils.DataStructureHelper;
import java.util.List;

import example.algorithms.sorting.BubbleSort;
import example.domain.Person;
import example.utils.CollectionUtils;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = DataStructureHelper.createList();
        List<String> strings = DataStructureHelper.createList();
        CollectionUtils.fillCollectionWithRandomInt(numbers, -5, 5, 5);
        CollectionUtils.printCollection(numbers);
        CollectionUtils.fillCollectionManually(strings, "ARA", 5);
        CollectionUtils.printCollection(strings);

        List<Person> persons = DataStructureHelper.createList();
        CollectionUtils.fillCollectionManually(persons, new Person("Max", "NY"), 2);
        CollectionUtils.fillCollectionManually(persons, new Person("Anna", "Muenchen"), 1);
        CollectionUtils.fillCollectionManually(persons, new Person("Beka", "Astana"), 1);
        CollectionUtils.printCollection(persons);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(numbers);
        CollectionUtils.printCollection(numbers);
    }
}
