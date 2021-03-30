package nectronalds.entities;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private static ArrayList<Menu> menus = new ArrayList<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void adicionarMenu(Menu menu) {
        menus.add(menu);
    }
}
