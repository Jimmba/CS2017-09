package by.it.sc02_morning.safronov.lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import static by.it.sc02_morning.menchytsky.lesson12.B_CountSort.sort;

/*
Первая строка содержит число 1<=n<=10000, вторая - n натуральных чисел, не превышающих 10.
Выведите упорядоченную по неубыванию последовательность этих чисел.

При сортировке реализуйте метод с вычислительной сложностью не более, чем O(n)
*/

public class B_CountSort {

    public static int[] sort(int[] array){
        int min, max = min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] > max){
                max = array[i];
            }
        }
        return sort(array, min, max);
    }
    public static int[] sort(int[] array, int min, int max){
        int[] count = new int[max - min +1];
        for (int i = 0; i < array.length ; i++) {
            count[array[i] - min]++;
        }
        int idx = 0;
        for (int i = 0; i < count.length ; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[idx++] = i + min;
            }
        }
        return array;
    }

    int[] countSort(InputStream stream) throws FileNotFoundException {
        //подготовка к чтению данных
        Scanner scanner = new Scanner(stream);
        //!!!!!!!!!!!!!!!!!!!!!!!!!     НАЧАЛО ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        //размер массива
        int n = scanner.nextInt();
        int[] points=new int[n];

        //читаем точки
        for (int i = 0; i < n; i++) {
            points[i]=scanner.nextInt();
        }

        //тут реализуйте логику задачи с применением сортировки подсчетом
        sort(points);
        //!!!!!!!!!!!!!!!!!!!!!!!!!     КОНЕЦ ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!

        return points;
    }


    public static void main(String[] args) throws FileNotFoundException {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/akhmelev/lesson12/dataB.txt");
        B_CountSort instance = new B_CountSort();
        int[] result=instance.countSort(stream);
        for (int index:result){
            System.out.print(index+" ");
        }
    }

}
