import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal() {


        };

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        BiteAbility biteAbility = new BiteAbility() {
            @Override
            public int bite() {
                return 0;
            }
        };

        ScratchAbility scratchAbility = new ScratchAbility() {
            @Override
            public int scratch() {
                return 0;
            }
        };


        List<Animal> animals = new ArrayList<Animal>();

        animals.add(cat1);
        animals.add(cat2);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(dog4);

        for (Animal animalNew : animals) {
            animalNew.setName("new name");
            animalNew.setAge(new Random().nextInt());
            animalNew.eat("Some food");
            animalNew.sleep();
        }

        System.out.println("Работает, но, что то явно сделано не так");
    }
}
