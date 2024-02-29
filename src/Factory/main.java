package Factory;

public class main {
    public static void main(String[] args){
        Academy_cooks academyCooks = createBySpecialty("meat");
        Cook cook = academyCooks.createCooks();

        cook.Cooking();
    }

    static Academy_cooks createBySpecialty(String specialty){
        if(specialty.equalsIgnoreCase("confectionner")){
            return new academy_confectionner();
        }else if(specialty.equalsIgnoreCase("fish")){
            return new academy_fish();
        }else if(specialty.equalsIgnoreCase("meat")){
            return new academy_meat();
        }else{
            throw new RuntimeException(specialty + "is unknown");
        }
    }
}
