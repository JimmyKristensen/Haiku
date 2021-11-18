package haikuanalysis;

public class HaikuPoem {
    private String name;
    private int poemId;
    private String firstLine;
    private String secondLine;
    private String thirdLine;

    public HaikuPoem(String name, int poemId,String firstLine, String secondLine, String thirdLine) {
        this.name = name;
        this.poemId = poemId;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;
    }

    public String getName() {
        return name;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public String getThirdLine() {
        return thirdLine;
    }

    public String showHaikuPoem(){
        String poem = getName() + "\n" +  getFirstLine() + "\n" + getSecondLine() + "\n" + getThirdLine();
        return poem;
    }

}


