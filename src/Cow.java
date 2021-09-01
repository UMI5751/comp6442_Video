public class Cow extends Animal {

    public Cow() {
        animalType = AnimalType.COW;
    }

    @Override
    public void call() {
        System.out.println("This is a cow");
    }
}
