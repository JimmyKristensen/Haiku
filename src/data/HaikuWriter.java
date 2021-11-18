package data;

import haikuanalysis.HaikuPoem;

import java.io.*;

public class HaikuWriter {
    public static void haikuSaver(HaikuPoem haikuPoem){
        int test = 1;
        try {
            FileWriter haikuWriter = new FileWriter("resources/haikupoem.csv",true);
            BufferedWriter br = new BufferedWriter(haikuWriter);
            PrintWriter pw = new PrintWriter(br);

            pw.print(test);
            pw.print(";");
            pw.print(haikuPoem.getName());
            pw.print(";");
            pw.print(haikuPoem.getFirstLine());
            pw.print(";");
            pw.print(haikuPoem.getSecondLine());
            pw.print(";");
            pw.print(haikuPoem.getThirdLine());
            pw.println();
            pw.flush();
            pw.close();
            /*
            haikuWriter.append(haikuPoem.getFirstLine());
            haikuWriter.append(haikuPoem.getSecondLine());
            haikuWriter.append(haikuPoem.getThirdLine());
            haikuWriter.append("Written by :" + haikuPoem.getName());
            haikuWriter.close();
            */
        } catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
