package model;

public class SaleItem {

    private Product product;
    private int quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal(){
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        String itemStr = String.format("%s %d %.2f",
                this.getProduct().getDescription(),
                this.getQuantity(),
                this.getSubTotal());

        return itemStr;
    }
}
