package ru.nickopol.HW1;

public class Multiplicity3and5 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 1000; i++) {
            if((i % 3 == 0) || (i % 5 == 0)){
                //System.out.println("Число кратное 3 или 5: "+i);
                sum += i;
            }
        }

        System.out.println("Ответ: Сумма чисел от 0 до 1000 кратных 3 и 5 = " + sum);
    }
}
