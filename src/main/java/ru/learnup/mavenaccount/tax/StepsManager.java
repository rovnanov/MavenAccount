package ru.learnup.mavenaccount.tax;
import ru.learnup.mavenaccount.tax.entities.Post;

import java.util.Scanner;

public class StepsManager {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String pass = "postgres";
    private static DbHelper helper = new DbHelper(url, user, pass);


    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            printAllPosts();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void addPostAndPrintAll(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день");
        final int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите кол-во шагов");
        final int steps = Integer.parseInt(scanner.nextLine());
        helper.addPost(
                new Post(day,steps));
        printAllPosts();
    }
    public static void printAllPosts(){
        for (Post post : helper.getAllPosts()){
            System.out.println(post);
        }
    }
    public static void addSteps(int day, int steps) {
        if (steps < 0) {
            throw new IllegalStepsException("Количество шагов не должно быть отрицательным значением: " + steps);
        }
        if (day < 1) {
            throw new IllegalDayException("Количество дней не может быть равно нулю или быть отрицательным: " + day);
        }
        if (day > 365) {
            throw new IllegalDayException("Количество дней не может быть больше 365: " + day);
        }
        helper.addPost(
                new Post(day,steps));
    }
}


