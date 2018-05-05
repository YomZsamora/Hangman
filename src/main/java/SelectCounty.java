import java.io.*;
import java.util.Random;

public class SelectCounty{

	private String selectedCounty;

	public void select(){
    	Console myConsole = System.console();
    	String[] counties = {"nyamira", "bungoma", "kakamega", "nyandarua", "marsabit", "mandera", "garissa", "kilifi", "kwale", "mombasa"};
    	Random rand = new Random();
    	int x = rand.nextInt(counties.length);
    	selectedCounty = counties[x];
	}

	public String getCounty() {
        return selectedCounty;
    }
}