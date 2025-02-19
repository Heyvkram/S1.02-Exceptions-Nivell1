public class Main {
    public static void main(String[] args) throws EmptySaleException {
        Sale sale = new Sale();
        System.out.println(sale.calculateTotal());

        Sale sale2 = new Sale();
        sale2.addProduct(new Product("car", 2500.00));

        try{
            System.out.println(sale2.products.get(2));;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        };
    }
}