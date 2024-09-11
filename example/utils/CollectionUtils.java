package example.utils;

import java.util.Collection;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Utility class for working with collections.
 * <p>
 * This class provides methods to fill collections with specific values or
 * random integers.
 * It includes:
 * <ul>
 * <li>{@link #fillCollectionManually(Collection, Object, int)}: Fills the given
 * collection with the specified value.</li>
 * <li>{@link #fillCollectionWithRandomInt(Collection, int, int, int)}: Fills
 * the given collection with random integers within the specified range.</li>
 * <li>{@link #printCollection(Collection)}: Prints the elements of the given
 * collection, separated by commas.</li>
 * </ul>
 * </p>
 * <p>
 * Example usage:
 * 
 * <pre>
 * List<Integer> numbers = new ArrayList<>();
 * CollectionUtils.fillCollectionManually(numbers, 5, 10);
 * </pre>
 * </p>
 * 
 * @see example.utils
 * 
 */

public class CollectionUtils {

    /**
     * Fills the specified collection with the given value, repeated the specified
     * number of times.
     * 
     * @param collection the collection to be filled, must not be null
     * @param value      the value to add to the collection
     * @param size       the number of times to add the value, must be greater than
     *                   0
     * @throws IllegalArgumentException if the collection is null or size is less
     *                                  than 1
     */
    public static <T> void fillCollectionManually(Collection<T> collection, T value, int size) {
        validateCollection(collection);
        validateSize(size);
        while (size > 0) {
            collection.add(value);
            size--;
        }
    }

    /**
     * Fills the specified collection with random integers within the given range,
     * repeated the specified number of times.
     * 
     * @param collection the collection to be filled, must not be null
     * @param from       the lower bound (inclusive) of the range of random integers
     * @param to         to the upper bound (exclusive) of the range of random
     *                   integers
     * @param size       the number of random integers to add, must be greater than
     *                   0
     * @throws IllegalArgumentException if the collection is null, size is less than
     *                                  1, or 'from' is not less than 'to'
     */
    public static void fillCollectionWithRandomInt(Collection<Integer> collection, int from, int to, int size) {
        validateCollection(collection);
        validateSize(size);

        if (from >= to) {
            throw new IllegalArgumentException("The 'from' value must be less than the 'to' value.");
        }

        Random random = new Random();
        while (size > 0) {
            int randomValue = random.nextInt(to - from) + from;
            collection.add(randomValue);
            size--;
        }
    }

    /**
     * Prints the elements of the given collection, separated by commas.
     * <p>
     * The elements are converted to their string representations using the
     * {@code toString()} method.
     * There will be no trailing comma after the last element.
     * </p>
     *
     * @param collection the collection whose elements are to be printed. Must not
     *                   be null.
     * @throws IllegalArgumentException if the collection is null.
     */
    public static <T> void printCollection(Collection<T> collection) {
        validateCollection(collection);
        String result = collection.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }

    private static <T> void validateCollection(Collection<T> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("Collection cannot be null.");
        }
    }

    private static void validateSize(int size) {
        if (size < 1) {
            throw new IllegalArgumentException("The 'size' value must be grater than 0.");
        }
    }
}
