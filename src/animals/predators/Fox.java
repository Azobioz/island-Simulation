package animals.predators;

import animals.Animal;

public class Fox extends Animal {
    @Override
    public <T> void eat(T food) {

    }

    @Override
    public Animal[] canEatOnly() {
        return new Animal[0];
    }


}