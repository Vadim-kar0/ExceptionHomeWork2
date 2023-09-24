package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a = inputFromConsole();
        System.out.println(a);
    }

    private static float inputFromConsole() {
        Scanner scanner = new Scanner(System.in);
        float a = 0f;
        boolean flag = true;
        while (flag){
            System.out.println("Введите дробное число");
            if(scanner.hasNextFloat()){
                a = scanner.nextFloat();
                flag = false;
            } else {
                System.out.println("Введенное значение не дробное число111");
                scanner.next();
            }
        }
        return a;
    }

}
