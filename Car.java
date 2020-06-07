public class Car implements Vehicle {
    private String name;
    private String model;
    private String color;
    private int year;

    public Car(String name, String model, String color, int year) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Car name: " + name + " " + "model: " + model + " " + "Color: " + color + " " + "Year: " + year);
    }

}