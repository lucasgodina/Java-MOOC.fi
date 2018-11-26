import java.util.Objects;

public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }


    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null){
            return false;
        }
        if(getClass() != o.getClass()){
            return false;
        }
        final Bird other = (Bird)o;
        if(this.latinName == null || other.latinName == null){
            return false;
        }
        if(!this.latinName.equals(other.latinName)){
            return false;
        }
        if(this.ringingYear != other.ringingYear){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        if(this.latinName == null){
            return -1;
        }

        return this.ringingYear + this.latinName.hashCode();
    }
}


