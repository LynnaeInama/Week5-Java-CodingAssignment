
public class App {

  static Logger Logger;
  
  public static void main(String[] args) {
    
    Logger logger = new AsteriskLogger();
    Logger logger1 = new SpacedLogger();
    
    logger.log("Sing");
    logger.error("Along");
    
    logger1.log("Happy");
    logger1.error("Days");
    
    logger.close();
    logger1.close();
  
    setLogger(new AsteriskLogger());
    setLogger(new SpacedLogger());
  
  }
  
  

    private static void setLogger(Logger l) {
      Logger = l;
  }
  
}
