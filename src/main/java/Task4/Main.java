package Task4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String s = exceptionIfStringEmpty();
        String s1 = exceptionIfStringHasOnlyWhiteSpaces();
    }


    /**
     * Если пользователь введёт пустую строку ("") будет выброшена ошибка
     * @return result
     */
    private static String exceptionIfStringEmpty() {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        if(result.length() == 0){
            throw new RuntimeException("Пустые строки вводить нельзя!!!");
        }
        return result;
    }


    /**
     * Если строка содержит только пробелы метод выкинет ошибку
     * @return result
     */
    private static String exceptionIfStringHasOnlyWhiteSpaces() {
        String result = exceptionIfStringEmpty();
        char[] characters = result.toCharArray();
        int count = 0;
        for (char character : characters) {
            if(Character.isSpaceChar(character)){
                count ++;
            }
        }
        if((characters.length == count)){
            throw new RuntimeException("Строка для программы не является пустой но визуально пустая");
        }
        return result;
    }
}
