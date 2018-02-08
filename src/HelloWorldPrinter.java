/**
 * Class responsible for printing hello world.
 */
public class HelloWorldPrinter {

  /**
   * Prints hello world.
   */
  public void printHelloWorld() {
    System.out.println("Hello world!");
  }

  /**
   * Prints a hello message using the supplied name. For example: printHelloMessage("Ada") will
   * print "Hello Ada!". Throws an IllegalArgumentException if name is null.
   */
  public void printHelloMessage(String name) {
    if(name == null) {
      throw new IllegalArgumentException("Name should not be null.");
    }
    System.out.println("Hello " + name + "!");
  }

}
