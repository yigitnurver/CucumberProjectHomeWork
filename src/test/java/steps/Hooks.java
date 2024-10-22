package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.CommonMethods;
import utils.PageInitializer;

import java.io.IOException;

public class Hooks extends CommonMethods {
    @Before
    public void start() throws IOException {
        openBrowserAndLaunchApplication();
    }

    @After
    public void end(){
        closeBrowser();
    }
}
