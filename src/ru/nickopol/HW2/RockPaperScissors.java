package ru.nickopol.HW2;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Создаем бота
        Player bot = new Player();

        // Создаем игрока
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        String userName = scanner.nextLine();
        System.out.print("Ваш выбор: камень, ножницы или бумага (можно в любом регистре): ");
        String userVariant = scanner.nextLine().toUpperCase();
        Player user = new Player(userName, userVariant);

        // Получаем результат
        System.out.println("========\nРезультат игры: " + bot.whoWins(bot, user));
    }
}
