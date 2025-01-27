import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products = new ArrayList<>();
    private double totalPrice;

    public Sale() {
    }

    public Sale(ArrayList<Product> products, double totalPrice) {
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public static double calculateTotal(Sale sale) throws CustomException{
        double total = 0.00;
        int i;
        if (!sale.products.isEmpty()) {
            for (i = 0; i < sale.products.size(); i++) {
                double price = sale.products.get(i).getPrice();
                total += price;
            }
        } else {
            throw new CustomException("You need to add a product to make a sale!", new IndexOutOfBoundsException());
        }
        return total;
    }


}
