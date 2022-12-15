import java.util.List;
import java.util.ArrayList;

public class SelectionSort {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(3);
        numbers.add(9);
        numbers.add(410);
        numbers.add(41);
        numbers.add(14);
        numbers.add(5);
        numbers.add(4);
        System.out.println(numbers);

        SelectionSort.selectionSort(numbers);
        System.out.println(numbers);
    }

    public static List<Integer> selectionSort(List<Integer> unordered) {
        for (int i = 0; i < unordered.size() - 1; i++) {
            for (int j = i + 1; j < unordered.size(); j++) {
                if (unordered.get(i) > unordered.get(j)) {
                    Integer temp = unordered.get(i);
                    unordered.set(i, unordered.get(j));
                    unordered.set(j, temp);
                }
            }
        }

        return unordered;
    }

}