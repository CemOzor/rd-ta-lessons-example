package Homework10;



import java.util.List;



    public class Madde2 {
        public static void main(String[] args) {
            List<Integer> numbers = List.of(1, 2, 3, 4, 5);
            int elementToFind = 7;

            int result = findElement(numbers, elementToFind);
            System.out.println("Result: " + result);
        }

        public static int findElement(List<Integer> list, int element) {
            return list.stream()
                    .filter(x -> x == element)
                    .findFirst()
                    .orElse(-1);
        }
    }

