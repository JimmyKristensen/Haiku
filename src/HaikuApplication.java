import haikuanalysis.HaikuAnalysisEngine;
import haikuanalysis.HaikuPoem;
import ui.Menu;

public class HaikuApplication {

    Menu menu = new Menu();
    HaikuAnalysisEngine haikuAnalysisEngine = new HaikuAnalysisEngine();

    public static void main(String[] args) {
        HaikuApplication haikuApplication = new HaikuApplication();

        haikuApplication.menu.welcomeUser();
        HaikuPoem haikuPoem = haikuApplication.menu.poemPromt();
        System.out.println(haikuPoem.showHaikuPoem());

        haikuApplication.haikuAnalysisEngine.checkIfHaikuIsAcceptable(haikuPoem);
    }
}
