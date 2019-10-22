import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        Animal dog1 = new Dog();
        Animal dog2 = new Dog();
        BiteAbility cat3 = new Cat();
        ScratchAbility cat4 = new Cat();
        BiteAbility dog3 = new Dog();
        BiteAbility dog4 = new Cat();

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(dog4);

        for (Animal animal : animals) {
            animal.setName("new name");
            animal.setAge(new Random().nextInt());
            animal.eat("Some food");
            animal.sleep();
        }
    }
}
