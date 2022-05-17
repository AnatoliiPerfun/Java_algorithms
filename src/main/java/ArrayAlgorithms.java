import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

import static java.lang.System.out;

public class ArrayAlgorithms {

    public static void main(String[] args) {
        int[] array = { 1, -2, -3, 4, 5, 25, 37, 68};

        out.println(linearSearch(array, 5));
        linearSearchTwo(array, 1).ifPresent(out::println);
        linearSearchTwo(array, 6).ifPresent(out::println);
        out.println();
        out.println(binarySearch(array, 68));
        out.println();
        Arrays.stream(findOddNums(array)).forEach(out::println);
        out.println();
        Arrays.stream(findEvenNums(array)).forEach(out::println);
        out.println();
//        Arrays.stream(reverseInt(array)).forEach(out::println);
        out.println();
        rotateArrayLeft(array);
        Arrays.stream(array).forEach(out::println);
        out.println(findIt(array));
    }


    public static int findIt(int[] array) {
        int odd = array[0];
        int length = array.length;
        for (int i = 1; i < length; i++) {
            odd ^= array[i];
        }
        return odd;
    }
    public static void rotateArrayLeft(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array[array.length - 1] = temp;
    }


    public static int[] reverseInt(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
//            int temp = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = temp;
        }
        return result;
    }
    public static int[] findEvenNums(int[] array) {
        IntPredicate isEven = num -> num % 2 == 0;
        return Stream.of(array)
                .flatMapToInt(Arrays::stream)
                .filter(isEven)
                .toArray();
    }
    public static int[] findOddNums(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : array) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static boolean binarySearch(int[] array, int item) {
        int min = 0;
        int max = array.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (item == array[mid]) {
                return true;
            } else if (item < array[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }
    public static OptionalInt linearSearchTwo(int[] array, int item) {
        return Arrays.stream(array).filter(x -> x == item).findFirst();
    }
    public static Integer linearSearch(int[] array, int item) {
        for (int current : array) {
            if (current == item) {
                return item;
            }

        }
        return null;
    }
}
