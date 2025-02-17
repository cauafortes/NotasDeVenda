package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sale {
    private List<SaleItem> items = new ArrayList<>();

    public void addSaleItem(SaleItem item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0;

        for (SaleItem saleItem : items) {
            total += saleItem.getSubTotal();
        }

        return total;
    }

    public List<SaleItem> getItems() {
        return new ArrayList<SaleItem>(items);
    }
}
