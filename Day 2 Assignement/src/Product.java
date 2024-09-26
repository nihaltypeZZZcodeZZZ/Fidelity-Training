public class Product {
    private int proid;
    private String proname;
    private double price;

    public Product(int proid, String proname, double price) {
        this.proid = proid;
        this.proname = proname;
        this.price = price;
    }

    public void display(){
        System.out.println("Product ID"+proid);
        System.out.println("Product Name"+proname);
        System.out.println("Product Price"+price);
        System.out.println();
    }

    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product(1000, "Earpods", 600);
        products[1] = new Product(1001, "Laptop", 70000);
        products[2] = new Product(1002, "Iphone 15+", 80000);
        products[3] = new Product(1003, "Puma Studs", 1500);
        products[4] = new Product(1004, "Headphones", 2500);

        for(Product product : products){
            product.display();
        }

    }
}
