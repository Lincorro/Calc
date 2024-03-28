import Model.imp.Add;
import View.View;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    static View view = new View();
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        view.view();
    }
}