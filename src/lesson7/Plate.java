package lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int appetite) {
        if (food - appetite < 0) {
            return false;
        } else {
            food -= appetite;
            return true;
        }
    }
    public void info() {
        System.out.println("В тарелке осталось " + food);
    }
    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
    public int getFood() {
        return food;
    }
}
