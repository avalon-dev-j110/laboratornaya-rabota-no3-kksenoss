package ru.avalon.java.dev.j10.labs.initialization;

import ru.avalon.java.dev.j10.labs.Initializer;
import java.util.Random;
/**
 * Инициализатор, выполняющий инициализацию массива
 * значениями последовательности случайных чисел.
 *
 * <p>Экземпляры класса можно использовать многократно для
 * инициализации любого числа массивов.
 *
 * <p>Диапазон, в пределах которого будут получены случайные
 * значения, передаётся в конструктор класса при
 * инициализации.
 */
public class RandomInitializer implements Initializer {

    /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */

    private int min;
    private int max;

    public RandomInitializer (int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void initialize(int[] array) {
        
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = (random.nextInt(max - min) + min);
        }
    }
}
     /**
     * Выполняет инициализацию массива, значениями
     * последовательности случайных чисел.
     *
     * @param array массив, подлежащий инициализации
     */
/*
         * TODO(Студент): Реализовать метод initialize класса RandomInitializer
         */