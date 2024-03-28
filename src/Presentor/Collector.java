package Presentor;

import Model.Calculable;
import Model.imp.Add;
import Model.imp.Multiplication;
import Model.imp.Separation;
import Model.imp.Subtraction;

import java.util.HashMap;
import java.util.Map;

public class Collector {
    static Map<String, Calculable> calculator = Map.of("+", new Add()
            , "-", new Subtraction()
            , "*", new Multiplication()
            ,"/",new Separation());

    public Calculable collector(String symbol) {
        return calculator.get(symbol);
    }
}
