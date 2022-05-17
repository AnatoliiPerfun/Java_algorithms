
import java.util.LinkedList;

public class LinkedListAlgo {

    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();
        // add elements in LinkedList
        languages.add("Java");
        languages.add("Python");
        languages.add("Typescript");
        languages.add("C#");
        languages.add("DART");

        System.out.println("LinkedList: " + languages);
        // get the element from the linked list
        String str = languages.get(2);
        System.out.print("Element at index 1: " + str);
        // remove elements from index 1
        String string = languages.remove(1);
        // change elements at index 3
        languages.set(3, "Kotlin");
        System.out.println("Removed Element: " + string);
        System.out.println("Updated LinkedList: " + languages);
    }
}
