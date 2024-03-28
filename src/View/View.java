package View;

import Presentor.Collector;
import java.io.IOException;
import java.util.Scanner;

public class View {
    Scanner scan = new Scanner(System.in);
    Collector collector = new Collector();
    public void view() {
        System.out.println(" Введите первое число");
        String  firstNumber = scan.next();
        System.out.println(" Введите первое мнимое число");
        String  firstImagen = scan.next();
        System.out.println(" Введите символ операции (\"+\", \"-\", \"/\", \"*\")");
        String symbol = scan.next();
        System.out.println(" Введите второе число");
        String  secondNumber = scan.next();
        System.out.println(" Введите второе мнимое число");
        String  secondImagen = scan.next();
        try {
            System.out.println(collector
                    .collector(symbol)
                    .calculate(Double.parseDouble(firstNumber),
                            Double.parseDouble(firstImagen),
                            Double.parseDouble(secondNumber),
                            Double.parseDouble(secondImagen)));
        }catch (Exception e){
            System.out.println("вы ввели не корректные значения, программа завершает работу");
        }

    }
}
