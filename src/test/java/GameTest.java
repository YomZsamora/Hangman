import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {
	



	@Test
	public void select_selectAWord_string() {
	    // Tests selectWord() function
	    Game wordSelect = new Game();
	    String expectedOutput = "bungoma";
    	assertEquals(expectedOutput, wordSelect.selectWord());
	}
}