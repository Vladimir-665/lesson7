package lesson7;

public class Test7 {
    public static void main(String[] args) {
        Cat [] cats = {
                new Cat("Барсик", 50),
                new Cat("Мурзик", 10),
                new Cat("Муська", 8),
                new Cat("Ктулху", 1000),
        };
        Plate plate = new Plate(100);
        for(Cat elementCat : cats) {
            elementCat.eat(plate);
            elementCat.info();
        }
        plate.info();
        //plate.setFood(plate.getFood() - cat.getAppetite());
    }
}
