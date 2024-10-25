import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        long start = System.currentTimeMillis();

        long sum = findSumm(arrayList);

        long end = System.currentTimeMillis();

        long arrayListTime = end - start;
        System.out.println("ArrayList time For i: " + arrayListTime);
        System.out.println(sum);


        start = System.currentTimeMillis();

        sum = findSummForEach(arrayList);

        end = System.currentTimeMillis();

        arrayListTime = end - start;
        System.out.println("ArrayList time For Each: " + arrayListTime);
        System.out.println(sum);


        start = System.currentTimeMillis();

        sum = findSumm(arrayList);

        end = System.currentTimeMillis();

        arrayListTime = end - start;
        System.out.println("ArrayList time Iterator: " + arrayListTime);
        System.out.println(sum);

        long start1 = System.currentTimeMillis();

        long sum1 = findSumm(linkedList);

        long end1 = System.currentTimeMillis();

        long linkedListTime = end1 - start1;
        System.out.println("linkedList time For i: " + linkedListTime);
        System.out.println(sum1);

        start1 = System.currentTimeMillis();

        sum1 = findSummForEach(linkedList);

        end1 = System.currentTimeMillis();

        linkedListTime = end1 - start1;
        System.out.println("linkedList time For Each: " + linkedListTime);
        System.out.println(sum1);

        start1 = System.currentTimeMillis();

        sum1 = findSummIterator(linkedList);

        end1 = System.currentTimeMillis();

        linkedListTime = end1 - start1;
        System.out.println("linkedList time Iterator: " + linkedListTime);
        System.out.println(sum1);
    }

    private static long findSumm(List<Integer> list) {
        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }


    private static long findSummForEach(List<Integer> list) {
        long sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    private static long findSummIterator(List<Integer> list) {
        long sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }
}
