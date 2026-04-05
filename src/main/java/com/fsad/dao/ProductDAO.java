package com.fsad.dao;

import com.fsad.entity.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductDAO {

    // CREATE -- Insert a new product
    public void saveProduct(Product product) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(product);
        tx.commit();
        session.close();
        System.out.println("Product saved: " + product.getName());
    }

    // READ -- Retrieve product by ID
    public Product getProduct(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Product product = session.get(Product.class, id);
        session.close();
        if (product != null)
            System.out.println("Product found: " + product);
        else
            System.out.println("No product found with ID: " + id);
        return product;
    }

    // UPDATE -- Update price and quantity of a product
    public void updateProduct(int id, double newPrice, int newQty) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Product product = session.get(Product.class, id);
        if (product != null) {
            product.setPrice(newPrice);
            product.setQuantity(newQty);
            session.update(product);
            tx.commit();
            System.out.println("Product updated: " + product.getName());
        } else {
            System.out.println("Product not found with ID: " + id);
        }
        session.close();
    }

    // DELETE -- Remove a product by ID
    public void deleteProduct(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Product product = session.get(Product.class, id);
        if (product != null) {
            session.delete(product);
            tx.commit();
            System.out.println("Product deleted: " + product.getName());
        } else {
            System.out.println("Product not found with ID: " + id);
        }
        session.close();
    }
}
