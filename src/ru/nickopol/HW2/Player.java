package ru.nickopol.HW2;

import java.util.Random;

public class Player {
    String name;
    String variant;

    Player() {
        this.name = "Бот";
        this.variant = String.valueOf(VARIANTS.values()[new Random().nextInt(VARIANTS.values().length)]);
    }

    Player(String playerName, String playerVariant) {
        this.name = playerName;
        this.variant = playerVariant;
    }

    public String whoWins(Player bot, Player user) {
        String winnerName = "";

        System.out.println("\n" + bot.name + ": " + bot.variant);
        System.out.println("--------");
        System.out.println(user.name + ": " + user.variant);

        if ((bot.variant.equals("БУМАГА") && user.variant.equals("КАМЕНЬ")) ||
            (bot.variant.equals("КАМЕНЬ") && user.variant.equals("НОЖНИЦЫ")) ||
            (bot.variant.equals("НОЖНИЦЫ") && user.variant.equals("БУМАГА"))) {
            winnerName = "Победитель - " + bot.name + "!";

        } else if (bot.variant.equals(user.variant)) {
            winnerName = "Ничья!";
        } else {
            winnerName = "Победитель - " + user.name + "!";
        }

        return winnerName;
    }
}
