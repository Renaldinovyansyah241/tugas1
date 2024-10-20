import java.util.ArrayList;

public class Cashier {
    private ArrayList<Item> items;

    public Cashier() {
        items = new ArrayList<>();
    }

    public void addItem(double p, String c, String n, int qty) {
        items.add(new Item(c, n, p, qty));
        System.out.println("Barang ditambahkan.");
    }

    public void removeItem(String code) {
        for (Item item : items) {
            if (item.getCode().equals(code)) {
                items.remove(item);
                System.out.println("Barang dihapus.");
                return;
            }
        }
        System.out.println("Barang tidak ditemukan.");
    }

    public void viewItems() {
        System.out.println("Daftar Barang:");
        for (Item item : items) {
            System.out.printf("Kode: %s, Nama: %s, Harga: %.2f, Jumlah: %d, Subtotal: %.2f\n",
                    item.getCode(), item.getName(), item.getPrice(), item.getQty(), item.getSubTotal());
        }
    }

    public void displayTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getSubTotal();
        }
        System.out.println("Total belanja: " + total);
    }

    public void processPayment(double payment) {
        double total = 0.0;
        for (Item item : items) {
            total += item.getSubTotal();
        }
        if (payment >= total) {
            double change = payment - total;
            System.out.println("Total belanja: " + total);
            System.out.println("Dibayar: " + payment);
            System.out.println("Kembalian: " + change);
        } else {
            System.out.println("Uang tidak cukup.");
        }
    }
}
