package ch07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[][] originalArray = {{1, 2, 3}, {1, 2, 3}, {4, 5, 6}};

        Set<List<Integer>> set = new HashSet<>();
        for (int[] innerArray : originalArray) {
            // Convert the inner array to a list and add it to the set
            set.add(Arrays.stream(innerArray).boxed().collect(Collectors.toList()));
        }

        // Optional: Convert the set back to a 2D array
        int[][] uniqueArray = set.stream()
                .map(list -> list.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

        // Print the unique arrays
        for (int[] array : uniqueArray) {
            System.out.println(Arrays.toString(array));
        }
    }
}

//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//public class RemoveDuplicates {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
//
//        Set<Integer> set = new HashSet<>();
//        for (int number : numbers) {
//            set.add(number);
//        }
//
//        // Set을 배열로 변환
//        int[] uniqueNumbers = set.stream().mapToInt(Integer::intValue).toArray();
//
//        // 결과 출력
//        System.out.println(Arrays.toString(uniqueNumbers));
//    }
//}
//
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//public class RemoveDuplicates {
//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//
//        Set<Integer> set = new HashSet<>(numbers);
//        List<Integer> uniqueNumbers = set.stream().collect(Collectors.toList());
//
//        // 결과 출력
//        System.out.println(uniqueNumbers);
//    }
//}
//
