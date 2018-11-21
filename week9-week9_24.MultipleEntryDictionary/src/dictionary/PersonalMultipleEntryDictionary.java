package dictionary;

import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, ArrayList<String>> dictionary;

    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String, ArrayList<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if (dictionary.get(word) == null) {
            dictionary.put(word, new ArrayList<String>());
        }
        dictionary.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if (dictionary.get(word) == null) {
            return null;
        }
        Set<String> translations = new HashSet<String>();
        for (String string : dictionary.get(word)) {
            translations.add(string);
        }
        return translations;
    }

    @Override
    public void remove(String word){
        dictionary.remove(word);
    }
}
