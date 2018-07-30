import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by : Volodymyr_Silitskyi
 * Created at : 7/30/2018
 */


public class App {
    final static Logger logger = LogManager.getLogger(App.class);
    public static void main(String[] args) {
        logger.info("This is info");
        logger.warn("This is warn");
        logger.error("This is error");
        logger.fatal("This is fatal");
    }
}
