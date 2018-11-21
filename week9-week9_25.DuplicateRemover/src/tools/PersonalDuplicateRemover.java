package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private List<String> strings;
    private int numberOfDetectedDuplicates;

    public PersonalDuplicateRemover(){
        this.strings = new ArrayList<String>();
        this.numberOfDetectedDuplicates = 0;
    }

    @Override
    public void add(String characterString){
        if(strings.contains(characterString)){
            this.numberOfDetectedDuplicates++;
        } else {
            strings.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates(){
        return this.numberOfDetectedDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings(){
        Set<String> stringSet = new HashSet<String>();
        for(String string : strings){
            stringSet.add(string);
        }
        return stringSet;
    }

    @Override
    public void empty(){
        this.strings = new ArrayList<String>();
        this.numberOfDetectedDuplicates = 0;
    }
}
