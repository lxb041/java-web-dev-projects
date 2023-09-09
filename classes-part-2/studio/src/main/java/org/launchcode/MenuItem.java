package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private String isNew;

    public MenuItem(double p, String d, String c, String iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(String aNew) {
        isNew = aNew;
    }
}

