package nectronalds;

import nectronalds.entities.Menu;
import nectronalds.entities.Product;
import nectronalds.entities.Restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product NecFeijoada = new Product("NecFeijoada", "Feijoada 100% brasileiro!", 34);
        Product NecBacon = new Product("NecBacon", "Lanche de bacon totalmente gostoso!", 59);
        Product NecAcaraje = new Product("NecAcaraje", "Acaraje da bahia", 120);
        Product NecPicanha = new Product("NecPicanha", "Picainha", 100);
        Product NecChimichurri = new Product("NecChimichurri", "Chimichurri", 96);
        Product NecCheddar = new Product("NecChedar", "Lanche de chedar!", 54);
        Product NecSushi = new Product("NecSushi", "Sushi", 342);

        Menu menuBR = new Menu("brasil");
        Menu menuARG = new Menu("argentina");
        Menu menuUSA = new Menu("usa");
        Menu menuJAP = new Menu("japao");

        menuBR.adicionarProduto(NecFeijoada);
        menuBR.adicionarProduto(NecBacon);
        menuBR.adicionarProduto(NecAcaraje);
        menuBR.adicionarProduto(NecPicanha);

        menuJAP.adicionarProduto(NecSushi);
        menuJAP.adicionarProduto(NecCheddar);

        menuARG.adicionarProduto(NecPicanha);
        menuARG.adicionarProduto(NecChimichurri);

        menuUSA.adicionarProduto(NecBacon);
        menuUSA.adicionarProduto(NecCheddar);

        Restaurant tiaPaula = new Restaurant("Restaurante da Tia Paula");

        tiaPaula.adicionarMenu(menuBR);
        tiaPaula.adicionarMenu(menuARG);
        tiaPaula.adicionarMenu(menuUSA);
        tiaPaula.adicionarMenu(menuJAP);

        int cont = 1;
        for (Menu menu : tiaPaula.getMenus()) {
            System.out.println("Cardapio #" + cont);
            System.out.println("País: " + menu.getPais());
            System.out.println("Produtos: ");

            for (Product product : menu.getProducts()) {
                System.out.println("    Nome: " + product.getName());
                System.out.println("    Descrição: " + product.getDescription());
                System.out.println("    Preço: " + formatBalance(product.getPrice()));
                System.out.println("");
            }

            cont++;
        }

    }

    public static String formatBalance(double value) {
        return NumberFormat.getCurrencyInstance().format(value);
    }
}
