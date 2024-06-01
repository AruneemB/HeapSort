import java.util.*;
public class HeapSort
{
    public static void heapSort (int [] array)
    {
        PriorityQueue<Integer> heap = new PriorityQueue<>((Collections.reverseOrder()));

        for (int a : array)
        {
            heap.offer(a);
        }

        for(int i = array.length - 1; i >= 0; i--)
        {
            array[i] = heap.poll();
        }
    }

    public static void main(String[] args)
    {
        Random r = new Random();
        int [] array = new int [10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = r.nextInt(100) + 1;
        }

        System.out.println("Array before Heap Sort: " + Arrays.toString(array));
        heapSort(array);
        System.out.println("Array after Heap Sort: " + Arrays.toString(array));
    }
}
