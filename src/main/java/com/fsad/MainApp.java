package com.fsad;

import com.fsad.dao.ProductDAO;
import com.fsad.entity.Product;

public class MainApp {
    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        // INSERT -- add 3 products
        dao.saveProduct(new Product("Laptop",   "Dell i7 16GB",    50000, 10));
        dao.saveProduct(new Product("Mouse",    "Wireless 2.4GHz",   699, 50));
        dao.saveProduct(new Product("Keyboard", "Mechanical RGB",   2999, 30));

        // READ -- fetch product with id = 1
        dao.getProduct(1);

        // UPDATE -- change Mouse price and quantity
        dao.updateProduct(2, 599, 60);

        // DELETE -- remove discontinued Keyboard (id = 3)
        dao.deleteProduct(3);
    }
}
