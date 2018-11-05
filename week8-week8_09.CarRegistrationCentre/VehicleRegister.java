import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner){
        if(owners.get(plate) != null){
            return false;
        } else {
            owners.put(plate, owner);
            return true;
        }
    }

    public String get(RegistrationPlate plate){
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate){
        if(owners.get(plate) == null){
            return false;
        } else {
            owners.remove(plate);
            return true;
        }
    }

    public void printRegistrationPlates(){
        for(RegistrationPlate plate : owners.keySet()){
            System.out.println(plate);
        }
    }

    public void printOwners(){
        ArrayList<String> ownersList = new ArrayList<String>();

        for(RegistrationPlate plate : owners.keySet()){
            if(!ownersList.contains(owners.get(plate))){
                ownersList.add(owners.get(plate));
            }
        }

        for(String owner : ownersList){
            System.out.println(owner);
        }
    }
}
