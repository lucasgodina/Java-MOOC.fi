package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private File file;
    private Scanner reader;

    public WordInspection(File file) throws Exception{
        this.file = file;
        this.reader = new Scanner(file, "UTF-8");
    }

    public int wordCount(){
        int count = 0;
        while(reader.hasNext()){
            count++;
            reader.nextLine();
        }
        return count;
    }

    public List<String> wordsContainingZ(){
        List<String> list = new ArrayList<String>();

        while(reader.hasNext()){
            String word = reader.nextLine();
            if(word.contains("z")){
             list.add(word);
            }
        }
        return list;
    }

    public List<String> wordsEndingInL(){
        List<String> list = new ArrayList<String>();

        while(reader.hasNext()){
            String word = reader.nextLine();
            if(word.charAt(word.length() -1 ) == 'l'){
                list.add(word);
            }
        }
        return list;
    }

    public List<String> palindromes(){
        List<String> list = new ArrayList<String>();

        while(reader.hasNext()){
            String word = reader.nextLine();
            String reverse = "";
            int i = word.length();
            while(reverse.length() < word.length()){
                reverse += word.charAt(i - 1);
                i--;
            }

            if(word.equals(reverse)){
                list.add(word);
            }
        }
        return list;
    }

    public List<String> wordsWhichContainAllVowels(){
        List<String> list = new ArrayList<String>();

        while(reader.hasNext()){
            String word = reader.nextLine();

            if(word.contains("a") && word.contains("e") && word.contains("i") && word.contains("o") && word.contains("u") && word.contains("u") && word.contains("y") && word.contains("ä") && word.contains("ö")){
                list.add(word);
            }
        }
        return list;
    }
}
