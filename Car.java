public class Car {
    private String model;

    public void showModel() {
        System.out.println("This is an: " + model);
    }

    public Car(String model) {
        this.model = model;
    }

}