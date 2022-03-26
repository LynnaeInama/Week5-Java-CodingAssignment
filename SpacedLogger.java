
public class SpacedLogger implements Logger{
  
  String space = " ";
  String errorPrint = "";
  
  //create a string with spaces between each character.
  
  @Override
  public void log(String log) {
    for(int i = 0; i<log.length(); i++) {
      char character = log.charAt(i);
      System.out.print(character + space);
     
   }
    
  }

  //create a string with ERROR: + a string with spaces between each character.
  
  @Override
  public void error(String error) {
    for(int i = 0; i<error.length(); i++) {
      errorPrint += error.charAt(i) + space;
    }
    System.out.print("\nERROR: " + errorPrint);
  }

  @Override
  public void close() {
   
    
  }

}
