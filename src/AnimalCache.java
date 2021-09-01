import javafx.scene.shape.Circle;

import java.util.Hashtable;

public class AnimalCache {

    private static Hashtable<String, Animal> animalMap
            = new Hashtable<String, Animal>();

    public static Animal getClonedAnimal(String animalId) {
        Animal cachedAnimal = animalMap.get(animalId);
        return (Animal) cachedAnimal.clone();
    }

    public static void loadCache() {
        Animal sheep = new Sheep();
        sheep.setId("1");
        animalMap.put(sheep.getId(),sheep);

        Animal cow = new Cow();
        cow.setId("2");
        animalMap.put(cow.getId(),cow);

        Animal dog = new Dog();
        dog.setId("3");
        animalMap.put(dog.getId(),dog);
    }
}