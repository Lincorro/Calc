package Model.imp;

import Model.Calculable;

import java.util.ArrayList;
import java.util.List;

public class Subtraction implements Calculable {
    private ArrayList<String> result = new ArrayList<>();
    GetSymbol getSymbol = new GetSymbol();
    public void Subtraction(){
    }

    @Override
    public List calculate(double firstInteger, double firstImaginary, double secondInteger, double secondImaginary) {
        result.add(String.valueOf(firstInteger - secondInteger));
        result.add(getSymbol.whoBigger(firstImaginary - secondImaginary));
        result.add(String.valueOf(firstImaginary - secondImaginary));
        result.add("i");
        return result;
    }
}
