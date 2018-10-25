public class StringUtils {

    public static boolean included(String word, String searched) {
        if(searched == null || word == null){
            return false;
        }
        word = word.trim();
        word = word.toUpperCase();
        searched = searched.trim();
        searched = searched.toUpperCase();

        if(word.contains(searched)){
            return true;
        }

        return false;
    }
}
