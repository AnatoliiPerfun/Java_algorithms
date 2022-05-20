import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HashAlgorithms {

    public static void main(String[] args) {
        findMissing(new int[] {1, 2, 3, 4},
                new int[]{1, 3}).forEach(System.out::println);
        System.out.println();
        findMissing(new int[] {5, 0, 7, 3, 2},
                new int[]{4, 7, 0, 5}).forEach(System.out::println);

        countEachEl(new String[] {"po", "lo", "add", "po", "char", "add"});
    }

    public static List<Integer> findMissing(int[] first, int[] second) {
        List<Integer> missingEl = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int x : second) {
            hashSet.add(x);
        }
        for (int x : first) {
            if (!hashSet.contains(x)) {
                missingEl.add(x);
            }
        }
        return missingEl;
    }

    public static void countEachEl(String[] arr) {
        HashMap<String, Integer> countMap = new HashMap<>();
        for(String s : arr) {
            if (!countMap.containsKey(s)) {
                countMap.put(s, 1);
            } else {
                countMap.put(s, countMap.get(s) + 1);
            }
        }
        countMap.forEach(((s, integer) -> System.out.println(s + " : " + integer)));
    }
}
