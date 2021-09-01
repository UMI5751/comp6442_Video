public class Dog extends Animal {

    public Dog(){
        animalType = AnimalType.DOG;
    }

    @Override
    public void call() {
        System.out.println("This is a dog");
    }
}