package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {
    private File file;

    public Analysis (File file) throws Exception{
        this.file = file;
    }

    public int lines() throws Exception{
        Scanner reader = new Scanner(this.file);
        int amountOfLines = 0;
        while(reader.hasNext()){
            amountOfLines++;
            reader.nextLine();
        }
        reader.close();
        return amountOfLines;
    }

    public int characters() throws Exception{
        Scanner reader = new Scanner(this.file);
        int amountOfChars = 0;
        while(reader.hasNext()){
            amountOfChars += reader.nextLine().length() + 1;
        }
        reader.close();
        return amountOfChars;
    }

}
