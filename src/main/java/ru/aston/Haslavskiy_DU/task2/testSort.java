package ru.aston.Haslavskiy_DU.task2;

import java.util.Arrays;
import java.util.Random;

public class testSort {
    public static void sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println("OK");
                break;
            }
            if (arr[i] <= arr[i + 1]) {
                continue;
            } else {
                System.out.println("Please, try again");
                break;
            }
        }
    }

    public static void rotateArr(int[] arr) {
        int bufer = 0;
        bufer = arr[arr.length - 1];
        arr[arr.length - 1] = arr[0];
        arr[0] = bufer;
        System.out.println("Первый последний элементы массива заменены: " + Arrays.toString(arr));
    }

    public static void checkVal(int[] arr) {
        boolean same = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                if (arr[i] == arr[j]) {
                    same = true;
                    break;
                } else continue;
            }
            if (!same) {
                System.out.println("Unique value is " + arr[i]);
                count++;
                break;
            } else {
                same = false;
                continue;
            } //уникальное значение
        }
        if (count == 0) System.out.println("Array haven't unique values");
    }

    public static int[] createArr(int sizearr, int maxRandom) {
        // исх. данные:размер массива и диапозон Random
        if (sizearr <= 1) return null;
        int[] arr = new int[sizearr];
        Random random = new Random();
        for (int i = 0; i < sizearr; i++) {
            arr[i] = random.nextInt(maxRandom);
        }
        return arr;
    }
    public static void mergeArr(int[] arr) {
        int n= arr.length;
        if (n==1) return;
        int middle = n/2;
        int[] left = new int[middle];
        int[] right = new int[n - middle];
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        for (int j = middle; j < n; j++) {
            right[j - middle] = arr[j];
        }
        mergeArr(left);
        mergeArr(right);
        merge (arr,left,right);
         }
         public static void merge(int[] arr, int[] left, int[] right) {
        int l= left.length;
        int r= right.length;
        int i=0;
        int j=0;
        int idx=0;
        while(i<l && j<r) {
            if (left[i]<right[j]) {
                arr[idx]=left[i];
                i++;
                idx++;}
            else {
                arr[idx]=right[j];
                j++;
                idx++;
            }
        }
        for (int ll=i;ll<l;ll++)
            arr[idx++]=left[ll];
        for (int rr=j;rr<r;rr++)
            arr[idx++]=right[rr];
         }
    public static void main(String[] args) {
        int[] test1 = new int[]{1, 2, 1, 1, 2, 4, 1, 4, 7, 10};
        int[] test2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test3 = new int[]{1, 2, 1, 2, 1, 2, 1, 2};
        int[] test4=createArr(10,100); // задача 4: создаем случайный массив
        System.out.println(Arrays.toString(test4)); // задача 4: начальный массив
        mergeArr(test4);// задача 4: сортируем случайный массив
        System.out.println(Arrays.toString(test4)); // задача 4: отсортированный массив
        sortArr(test1); // задача 1: массив не отсортирован
        sortArr(test2); // задача 1: массив отсортирован
        rotateArr(test1); // задача 2: переворачиваем первый-последний элемент+вывод в консоль
        checkVal(test2);//задача 3: поиск уникального значения, массив тест3 для проверки обратного случая

    }
}


