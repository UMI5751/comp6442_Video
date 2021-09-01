public class Sheep extends Animal {

    public Sheep() {
        animalType = AnimalType.SHEEP;
    }

    @Override
    public void call() {
        System.out.println("This is a sheep");
    }
}
