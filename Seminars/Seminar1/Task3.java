package Seminars.Seminar1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        LocalDateTime datetTime = LocalDateTime.now();
        int i = datetTime.getHour();
        
        String temp = "";
        if(i >= 5 && i < 12){
            temp = "Доброе утро";
        }
        if(i >= 12 && i < 18){
            temp = "Добрый день";
        }
        if(i >= 18 && i < 23){
            temp = "Добрый вечер"; 
        }
        if(i < 5 || i == 23){
            temp = "Доброй ночи";
        }
        System.out.println(temp + "," + s);

    }
}
