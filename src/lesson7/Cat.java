package lesson7;

public class Cat {

     private String name;
     private int appetite;
     private boolean fullAbdomen;

     public Cat(String name, int appetite) {
         this.name = name;
         this.appetite = appetite;

     }
    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public void eat(Plate plate) {
       fullAbdomen = plate.decreaseFood(appetite);
    }
    public void info() {
        System.out.println(name + "" + (fullAbdomen ? " сытый " : " голодный"));
    }
}
