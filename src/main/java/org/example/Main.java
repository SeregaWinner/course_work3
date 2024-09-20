package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Список книг
        List<String> bookTitles = new ArrayList<>(Arrays.asList(
                "Война и мир",
                "Преступление и наказание",
                "Анна Каренина",
                "Властелин колец",
                "Мастер и Маргарита",
                "Гарри Поттер и философский камень",
                "Тёмная башня",
                "Дракула",
                "Первому игроку приготовиться",
                "Собачье сердце"
        ));

        List<List<String>> bookLibrary = createListBoks(bookTitles);
        //Вывод результата

        for (int i = 0; i < bookLibrary.size(); i++) {
            System.out.println("Полка " + (i + 1) + ": " + bookLibrary.get(i));
        }
    }

    public static List<List<String>> createListBooks(List<String> bookTitles) {
        //Сортировка книг по алфавиту
        Collections.sort(bookTitles);

        int countShelf = 5;//Колличество полок
        List<List<String>> shelf = new ArrayList<>();//Список книг для каждой полки
        //Распределение книг по полкам
        int count = (int) Math.ceil((double) bookTitles.size() / countShelf);
        for (int i = 0; i < countShelf; i++) {
            int from = i * count;
            int to = Math.min(from + count, bookTitles.size());
            if (from < bookTitles.size()) {
                shelf.add(new ArrayList<>(bookTitles.subList(from, to)));
            } else {
                shelf.add(new ArrayList<>());
            }
        }
        return shelf;
    }
    public static List<List<String>> createListBoks(List<String> bookTitles){
        Collections.sort(bookTitles);
        int countShelf = 5;
        List<List<String>> shelf = new ArrayList<>();
        int count = (int) Math.ceil((double) bookTitles.size()/countShelf);
        for (int i = 0; i < countShelf; i++) {
            int from = i * count;
            int to = Math.min(from + count, bookTitles.size());
            if(from< bookTitles.size()){
                shelf.add((new ArrayList<>(bookTitles.subList(from,to))));
            }else {
                shelf.add(new ArrayList<>());
            }
        }
        return shelf;
    }
}

