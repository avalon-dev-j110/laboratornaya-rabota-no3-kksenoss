package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import java.util.Random;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;


public class Application {

    public static void main(String[] args) {
   
    Initializer fibonacciInitializer = new FibonacciInitializer();
    Initializer randomInitializer = new RandomInitializer();
    Sort bubbleSort = new BubbleSort();
    Random random = new Random();   
        
    int[] array = new int[20];
    
    for (int i = 0; i < array.length; i++) {       

			array[i] = (random.nextInt(100));
		}
                
                System.out.println("Тестовый вывод");
                System.out.println("------------------------------------------------"); 
		toInit(array, fibonacciInitializer);
                System.out.println("(массив Фибоначчи)");
		sumArr(array);
                
                System.out.println("------------------------------------------------");   
                
		toInit(array, randomInitializer);
                System.out.println("(Случайные числа -50..50)");
		 
                System.out.println("------------------------------------------------");  
                
		System.out.println("(Сортировка пузырьком)");
		toSort(array, bubbleSort);	   
        }
    
                public static void toInit(int[] array, Initializer initializer) {
		initializer.initialize(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + "й" + " элемент массива " + " = " + array[i]);

		}

	}

                public static void toSort(int[] array, Sort sort) {
		sort.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + "й" + " элемент массива " + " = " + array[i]);
		}

	}

                public static void sumArr (int[] array) {
		int sumValues = 0;
		for (int i = 0; i < array.length; i++) {
			sumValues = sumValues + array[i];
		}
		System.out.println("Сумма " + array.length + " чисел массива = " + sumValues);

	}
}
/*
1й тестовый запуск рандома
0й элемент массива  = 12
1й элемент массива  = 5
2й элемент массива  = 43
3й элемент массива  = -15
4й элемент массива  = -14
5й элемент массива  = 15
6й элемент массива  = 5
7й элемент массива  = -3
8й элемент массива  = 42
9й элемент массива  = 7
10й элемент массива  = 43
11й элемент массива  = -48
12й элемент массива  = 17
13й элемент массива  = 19
14й элемент массива  = 11
15й элемент массива  = -5
16й элемент массива  = -43
17й элемент массива  = 31
18й элемент массива  = 1
19й элемент массива  = 5

2й запуск рандома 
0й элемент массива  = -24
1й элемент массива  = 44
2й элемент массива  = 0
3й элемент массива  = -25
4й элемент массива  = 8
5й элемент массива  = -16
6й элемент массива  = 44
7й элемент массива  = -1
8й элемент массива  = 11
9й элемент массива  = -4
10й элемент массива  = -9
11й элемент массива  = -41
12й элемент массива  = -21
13й элемент массива  = -43
14й элемент массива  = 18
15й элемент массива  = 36
16й элемент массива  = 30
17й элемент массива  = -47
18й элемент массива  = -4
19й элемент массива  = 6
*/
 /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */