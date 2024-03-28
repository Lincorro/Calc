package Model.imp;

import Model.Calculable;

import java.util.ArrayList;
import java.util.List;

public class Separation implements Calculable {
    public Separation() {
    }
    private ArrayList<String> result = new ArrayList<>();
    GetSymbol getSymbol = new GetSymbol();

    @Override
    public List calculate(double firstInteger, double firstImaginary, double secondInteger, double secondImaginary) {
        double first = ((firstInteger*secondInteger)+(firstImaginary*secondImaginary))/((secondInteger*secondInteger)+(secondImaginary*secondImaginary));
        double second = ((secondInteger*firstImaginary)-(firstInteger*secondImaginary))/((secondInteger*secondInteger)+(secondImaginary*secondImaginary));
        result.add(String.valueOf(first));
        result.add(getSymbol.whoBigger(second));
        result.add(String.valueOf(second));
        result.add("i");
        return result;
    }
}
