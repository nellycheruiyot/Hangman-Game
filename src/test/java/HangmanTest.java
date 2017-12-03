import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {


  @Test
  public void newHangman_instantiatesCorrectly() {
    Hangman testHangman = new Hangman();
    assertEquals(true, testHangman instanceof Hangman);
  }

  @Test
  public void newHangman_randomlySelectsWord_String() {
    Hangman testHangman = new Hangman();
    assertEquals(true, testHangman.getWord() instanceof String);
  }
}
