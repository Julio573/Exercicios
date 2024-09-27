package Ex2;

public class Product {
    private String Name;
    private double Price;
    private int Quantity;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        this.Quantity = quantity;
    }

    public double TotalValueInStock() {
        return getPrice() * getQuantity();
    }

    public void AddProducts(int quantity) {
        this.setQuantity(Quantity += quantity);
    }

    public void RemoveProducts(int quantity) {
        this.setQuantity(Quantity -= quantity);
    }


}
