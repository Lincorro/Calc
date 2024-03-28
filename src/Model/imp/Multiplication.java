package Model.imp;

import Model.Calculable;

import java.util.ArrayList;
import java.util.List;

public class Multiplication implements Calculable {
    private ArrayList<String> result = new ArrayList<>();
    GetSymbol getSymbol = new GetSymbol();
    public Multiplication(){
    }

    @Override
    public List calculate(double firstInteger, double firstImaginary, double secondInteger, double secondImaginary) {
        result.add(String.valueOf((firstInteger*secondInteger)-(firstImaginary*secondImaginary)));
        result.add(getSymbol.whoBigger((firstInteger*secondImaginary)+(firstImaginary*secondInteger)));
        result.add(String.valueOf((firstInteger*secondImaginary)+(firstImaginary*secondInteger)));
        result.add("i");
        return result;
    }

}
