
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    /**
     * Реализуйте метод, который принимает на вход список целых чисел, определяет в списке количество четных чисел и выводит их в консоль.
     * Решите задание именно с применением Stream API.
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(11, 28, -44, 23, 19, 750, -10, 121, 615, 253, 18);
        printEvenNumbers(list);
    }

        public static void printEvenNumbers (List < Integer > list) {
            List<Integer> evenList = list.stream()
                    .filter(number -> number % 2 == 0)
                    .collect(Collectors.toList());
            System.out.println("количество четных элементов в списке: " + evenList.size());
            System.out.println(evenList);
        }
    }

