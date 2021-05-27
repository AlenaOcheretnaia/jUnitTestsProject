package worknumbersstream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main (String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> resultList = oddMoreThanZeroNaturalOrder(intList);
        for(Integer model : resultList) {
            System.out.print(model + " ");
        }

        List<String> stringList = Arrays.asList("star", "world", "space");
    }

    public static List<Integer> oddMoreThanZeroNaturalOrder(List<Integer> input) {
        List<Integer> result = input.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        return result;
    }

}
