package com.aston.HomeWork2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        System.out.println("1. Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей\n" +
                "к большей)");
        transactions
                .stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("2. Вывести список неповторяющихся городов, в которых работают трейдеры.");
        transactions.stream()
                .map(k -> k.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("3. Найти всех трейдеров из Кембриджа и отсортировать их по именам.");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(k -> k.getTrader().getName()))
                .forEach(System.out::println);

        System.out.println("4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном\n" +
                "порядке.");
        String allNames = transactions.stream()
                .map(k -> k.getTrader().getName())
                .sorted()
                .distinct()
                .reduce((name1, name2) -> name1 + ", " + name2)
                .orElse("");
        System.out.println(allNames);

        System.out.println("5. Выяснить, существует ли хоть один трейдер из Милана.");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Milan"))
                .sorted(Comparator.comparing(k -> k.getTrader().getName()))
                .limit(1)
                .forEach(System.out::println);

        System.out.println("6. Вывести суммы всех транзакций трейдеров из Кембриджа.");
        int sum = transactions.stream()
                .filter(t -> "Cambridge".equals(t.getTrader().getCity()))
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println(sum);


        System.out.println("7. Какова максимальная сумма среди всех транзакций?");
        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .limit(1)
                .forEach(System.out::println);

        System.out.println("8. Найти транзакцию с минимальной суммой.");
        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .limit(1)
                .forEach(System.out::println);
    }
}
