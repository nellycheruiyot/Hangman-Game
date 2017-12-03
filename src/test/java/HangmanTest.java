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

  @Test
  public void newHangman_setsIntialValueForAnswer_String() {
    Hangman testHangman = new Hangman();
    String testStr = new String(new char[testHangman.getWord().length()]).replace("\0", "-");
    // Character.toString(testHangman.getAnswer().charAt(0));
    assertEquals(testStr, testHangman.getAnswer());
  }

  @Test
  public void playGame_checksIfLetterExistsInWord_false() {
    Hangman testHangman = new Hangman();
    testHangman.playGame("o");
    assertEquals(false, testHangman.getHang());
  }

  @Test
  public void playGame_checksIfLetterExistsInWord_true() {
    Hangman testHangman = new Hangman();
    testHangman.playGame("z");
    assertEquals(true, testHangman.getHang());
  }
}
