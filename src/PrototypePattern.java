
public class PrototypePattern {
    public static void main(String[] args) {
        AnimalCache.loadCache();

        Animal clonedAnimal = (Animal) AnimalCache.getClonedAnimal("1");
        System.out.println("This animal is a cloned : " + clonedAnimal.getType());

        Animal clonedAnimal2 = (Animal) AnimalCache.getClonedAnimal("2");
        System.out.println("This animal is a cloned : " + clonedAnimal2.getType());

        Animal clonedAnimal3 = (Animal) AnimalCache.getClonedAnimal("3");
        System.out.println("This animal is a cloned : " + clonedAnimal3.getType());
    }









}
