package view;

import model.Product;
import model.Sale;
import model.SaleItem;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Product rice = new Product();
        rice.setDescription("Arroz Tatiana");
        rice.setPrice(30);

        Product beans = new Product();
        beans.setDescription("Feijao Feijó");
        beans.setPrice(20);

        Product pasta = new Product();
        pasta.setDescription("Macarrão Santa Amália");
        pasta.setPrice(15);

        SaleItem itemBeans = new SaleItem();
        itemBeans.setProduct(beans);
        itemBeans.setQuantity(2);

        SaleItem itemRice = new SaleItem();
        itemRice.setProduct(rice);
        itemRice.setQuantity(1);

        SaleItem itemPasta = new SaleItem();
        itemPasta.setProduct(pasta);
        itemPasta.setQuantity(6);

        Sale sale = new Sale();
        sale.addSaleItem(itemBeans);
        sale.addSaleItem(itemPasta);
        sale.addSaleItem(itemRice);

        for (SaleItem item : sale.getItems()) {

            System.out.println(item);
        }


        System.out.println(String.format("Totel: %.2f", sale.getTotal()));

    }
}