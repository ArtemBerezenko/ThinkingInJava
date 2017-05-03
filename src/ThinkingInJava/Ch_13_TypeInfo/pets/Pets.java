package ThinkingInJava.Ch_13_TypeInfo.pets;

import java.util.ArrayList;

/**
 * Created by Home on 13.12.2016.
 */
public class Pets {
    public static final PetCreator creator =
            new LiteralPetCreator();
    public static Pet randomPet(){
        return creator.randomPet();
    }
    public static Pet[] createArray(int size){
        return creator.createArray(size);
    }
    public static ArrayList<Pet> arrayList(int size){
        return creator.arrayList(size);
    }
}
