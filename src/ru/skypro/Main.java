package ru.skypro;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	//Задание 1
        int currentNum = 0;
        while (currentNum < 10) {
            System.out.println(++currentNum + " ");
        }
        System.out.println();

        for (; currentNum > 0; currentNum--) {
            System.out.println(currentNum + " ");
        }
        System.out.println();

    //Задание 2
    int firstFriday = 5;

        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Подготовьте отчет,сегодня пятница " + currentFriday);
        }
    //Задание 3
    int currentYear = LocalDate.now().getYear();
        int start = currentYear - 200;
        int finish = currentYear + 100;
        for (int year = start; year <= finish; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}


