public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name="Ela";
        product.price=10;
        productManager.add(product);

        DatabaseHelper.Crud.add();
        DatabaseHelper.Connection.createConnection();
    }
}