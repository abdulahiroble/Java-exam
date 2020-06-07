public class Apple implements Fruit {
    private int price;
    private String name;
    private double weight;

    public Apple(int price, String name, double weight) {
        this.price = price;
        this.name = name;
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public void showData() {
        System.out.println("Fruit name: " + name + " " + ",Fruit price: " + price + " " + ",Fruit weight: " + weight);
    }
}