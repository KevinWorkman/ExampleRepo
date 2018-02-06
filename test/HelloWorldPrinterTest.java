import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class HelloWorldPrinterTest {

  private HelloWorldPrinter helloWorldPrinter;
  private PrintStream mockSystemOut;

  @Before
  public void setup() {
    mockSystemOut = Mockito.mock(PrintStream.class);
    System.setOut(mockSystemOut);
    helloWorldPrinter = new HelloWorldPrinter();
  }

  @Test
  public void testPrintHelloWorld() {
    helloWorldPrinter.printHelloWorld();

    Mockito.verify(mockSystemOut).println("Hello world!");
  }
}