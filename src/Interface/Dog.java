package Interface;

public class Dog extends Mammal implements Omnivores{
    @Override
    public void eatAnimals() {
        System.out.println("Eating chicken");
    }

    @Override
    public void eatPlant() {
        System.out.println("Eating plant based food");
    }
}
