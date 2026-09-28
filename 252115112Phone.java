public class phone {
    String model;
    int storageGb;
    double price;

    phone(String model, int storageGB, double price) {
        this.model = model;
        this.storageGb = storageGB;
        this.price = price;
    }

    public static void main(String[] args) {
        phone p = new phone("redmi note 13 pro", 128, 29.99);

        System.out.println("Model: " + p.model);
        System.out.println("storage: " + p.storageGb + "GB");
        System.out.println("price: $" + p.price);
    }
}
