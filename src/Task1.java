import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {

        /**
         * Напишите метод public static void findMinMax, который будет находить в стриме минимальный и максимальный элементы в соответствии с порядком,
         * заданным Comparator'ом.
         * Данный метод принимает на вход 3 элемента:
         * Stream <? extends T> stream
         * Comparator <? super T> order
         * BiConsumer <? super T, ? super T> minMaxConsumer
         * Найденные минимальный и максимальный элементы передавайте в
         * minMaxConsumer
         *  следующим образом:
         * minMaxConsumer.accept(min, max);
         * Если стрим не содержит элементов, то вызывайте:
         * minMaxConsumer.accept(null, null);
         */

        List<Integer> list = List.of(-126, 11, 458, 226, 124, 785, 1124, -478, 12, 196, 1997, 29, 10, -1922);
        Stream<Integer> stream = list.stream();
        Comparator<Integer> order = (o1, o2) -> o1.compareTo(o2);
        BiConsumer<Integer, Integer> biConsumer = (min, max) -> System.out.println("мин. значение " + min + " " + "макс. значение " + max);
        findMinMax(list.stream(), order, biConsumer);


    }

    public static void findMinMax(Stream<Integer> stream, Comparator<Integer> order, BiConsumer<Integer, Integer> minMaxConsumer) {
        List<Integer> integerList = stream.sorted(order).toList();
        if (integerList.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            int min = integerList.get(0);
            int max = integerList.get(integerList.size() - 1);
            minMaxConsumer.accept(min, max);
        }

    }

}
