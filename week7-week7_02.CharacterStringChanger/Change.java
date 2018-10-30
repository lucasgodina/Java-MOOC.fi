public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString){
        String newString = "";
        int i = 0;

        while(i < characterString.length()){
            if(characterString.charAt(i) == this.fromCharacter){
                newString = newString + this.toCharacter;
                i++;
            } else {
                newString = newString + characterString.charAt(i);
                i++;
            }
        }

        return newString;
    }
}
