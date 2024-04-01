package ru.pestova;

import static java.lang.Integer.MAX_VALUE;

public class Operations {
    public static void main(String[] args) {

        int number1 = 1;
        int number2 = MAX_VALUE;
        double number3 = 0.8;
        short number4 = 32000;

        //Переполнение при вычислениях
        System.out.println(number1 +=number2);

        //Математические операторы и комбинации типов данных
        System.out.println("Результат сложения "+ (number4 + number3));
        System.out.println("Результат вычитания "+ (number4 - number3));
        System.out.println("Результат умножения "+ (number4 * number3));
        System.out.println("Остаток от деления "+ (number4 % number3));
        System.out.println("Постфикс ++ " + number4++);
        System.out.println("Постфикс -- " + number4--);
        System.out.println("Префикс ++ " + ++number1);
        System.out.println("Префикс -- " + --number4);

        //Операторы сравнения и конструкция if-else
        if(number3 < 1.0 && number3 > 0.0) {
            System.out.println("Число в диапазоне от нуля до единицы");
        }
        else if(number3 > 1.0 || number3 < 0.0)
            System.out.println("Число точно больше единицы или точно меньше нуля");
    }
}