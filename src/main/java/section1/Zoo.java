package section1;

public class Zoo {

    public static void main(String[] args) {

//        Animal tiger = new Animal(3, "M", 200);
//        Animal parrot = new Animal(20, "M", 10);
//        Animal snake = new Animal(2, "F", 15);
//
//        tiger.sleep();
//        parrot.sleep();
//        snake.eat();

        Bird bird = new Bird(3, "F", 10);
        Fish fish = new Fish(1, "M", 2);
//        bird.fly();
        bird.eat();
        bird.sleep();
        fish.swim();
        //fish.move();

        Chicken chicken = new Chicken(1, "M", 7);
        chicken.fly();
        Sparrow sparrow = new Sparrow(1, "M", 4);
        sparrow.fly();
        sparrow.move();

        Animal sparrow2 = new Sparrow(2, "F", 10);
        sparrow2.move();

        moveAnimal(fish);
        moveAnimal(sparrow2);

        Flyable flyingBird = new Sparrow(1, "M", 4);
        flyingBird.fly();
    }

    public static void moveAnimal(Animal animal) {
        animal.move();
    }
}
