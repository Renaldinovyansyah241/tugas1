public class Item {
    private double itemPrice;
    private String itemName;
    private String itemCode;
    private int itemQty;

    public Item(String code, String name, double price, int qty) {
        this.itemCode = code;
        this.itemName = name;
        this.itemPrice = price;
        this.itemQty = qty;
    }

    public double getPrice() {
        return itemPrice;
    }

    public String getCode() {
        return itemCode;
    }

    public String getName() {
        return itemName;
    }

    public int getQty() {
        return itemQty;
    }

    public double getSubTotal() {
        return itemPrice * itemQty;
    }
}
