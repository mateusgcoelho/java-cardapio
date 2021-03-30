package nectronalds.entities;

import java.util.ArrayList;

public class Menu {
    private String pais;
    private ArrayList<Product> products = new ArrayList<>();

    public Menu(String pais) {
        this.pais = pais;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void adicionarProduto(Product product) {
        this.products.add(product);
    }
}
