public class Market {
    public static void main(String[] args) {
        Apple a = new Apple(21, "apple", 2.34);
        Apple b = new Apple(25, "banana", 3.44);

        System.out.println(a.getPrice() + " " + a.getName());

        if (a.getPrice() == b.getPrice()) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        if (a.getName().equals(b.getName())) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        a.showData();

    }
}