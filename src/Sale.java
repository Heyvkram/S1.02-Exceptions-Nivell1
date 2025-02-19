import java.util.ArrayList;
import java.util.List;

public class Sale {
    public List<Product> products;
    public double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = totalPrice;
    }
    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() throws EmptySaleException{
        if(products.isEmpty()){
            throw new EmptySaleException("You need to add a product to make a sale!");
        }

        for (Product product : products) {
            this.totalPrice += product.getPrice();
        }

        return totalPrice;
    }
}
