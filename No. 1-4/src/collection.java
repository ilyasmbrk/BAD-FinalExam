import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class collection {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("\nArrayList:");
        for (int number : arrayList) {
            System.out.println(number);
        }
    }
}
