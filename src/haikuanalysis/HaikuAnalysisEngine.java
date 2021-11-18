package haikuanalysis;

import data.HaikuWriter;

import java.util.Locale;

public class HaikuAnalysisEngine {
    private char vowel[] = {'A','a','E','e','I', 'i','O', 'o','U', 'u', 'Y', 'y'};

    public char[] geVowel() {
        return vowel;
    }

    public boolean checkSyllables(String stringToCheck, int syllablesCheck){
        char[] vowels = geVowel();
        int syllablesCount = 0;
        char lastChar = '.';
        for (int i = 0; i < stringToCheck.length(); i++) {
            char currentChar = stringToCheck.charAt(i);
            for (int j = 0; j < vowels.length; j++) {
                if (currentChar == vowels[j] && lastChar == currentChar){
                    syllablesCount--;
                }
                if (currentChar == vowels[j]){
                    syllablesCount++;
                }
            }
            lastChar = currentChar;
        }
        boolean checkIfSyllableCountIsCorrect = syllablesCount == syllablesCheck;
        return checkIfSyllableCountIsCorrect;
    }

    public void checkIfHaikuIsAcceptable(HaikuPoem currentHaiku){
        boolean checkFirstLine = checkSyllables(currentHaiku.getFirstLine(),5);
        boolean checkSecondLine = checkSyllables(currentHaiku.getSecondLine(), 7);
        boolean checkThirdLine = checkSyllables(currentHaiku.getThirdLine(), 5);
        if (checkFirstLine && checkSecondLine && checkThirdLine){
            HaikuWriter.haikuSaver(currentHaiku);
        } else {
            System.out.println("Sorry this doesn't qualify as a haiku");
        }
    }


}
