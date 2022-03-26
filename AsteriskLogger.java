
public class AsteriskLogger implements Logger{

  
//Creates a printout where 3 *'s are added before and after the string.
  
  @Override
  public void log(String log) { 
    System.out.println("***" + log + "***");
    
  }

  
  //Creates a printout where, no matter how many characters are in the error string provided, 
  //a line of " * " will  evenly match top, middle and bottom.  Creating a box.
  
  @Override
  public void error(String error) {
    String count = "";
    for(int i = 1; i<=error.length(); i++) {
      count += "*";
    }
    System.out.println("");
    System.out.println("***" + count + "***");
    System.out.println("***" + error + "***");
    System.out.println("***" + count + "***");
    System.out.println("");
  }
  
    
  @Override
  public void close() {
    
  }
 
  
}