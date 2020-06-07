public class Broker {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corola", "red", 2007);
        Car car2 = new Car("Ford", "Mustang", "blue", 2007);

        // if (car1.getYear() == car2.getYear()) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("Not equal");
        // }

        // if (car1 == car2) {
        // System.out.println("Equal");
        // } else {
        // System.out.println("Not equal");
        // }

        if (car1.getName() == car2.getName()) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        car2.showInfo();

    }
}