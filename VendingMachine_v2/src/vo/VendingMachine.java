package vo;

public class VendingMachine {
    private String product;
    private int price;
    private int stock;
    private int sales;

    // Getter
    public String getProduct() {
        return product;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    public int getSales() {
        return sales;
    }

    // Setter
    public void setProduct(String product) {
        this.product = product;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    // 누적
    public void sumPrice() {
        this.sales = this.sales + this.price;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", sales=" + sales +
                '}';
    }
}
