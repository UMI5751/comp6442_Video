public abstract class Animal implements Cloneable {

    private String id;
    protected AnimalType animalType;

    abstract void call();

    public AnimalType getType() {
        return animalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
