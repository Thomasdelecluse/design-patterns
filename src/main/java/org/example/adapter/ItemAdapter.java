package org.example.adapter;

public class ItemAdapter implements IItem {

    private Item realItem;
    public ItemAdapter(String pomme, String pierre) {
        this.realItem = new Item(pomme, pierre);
    }

    @Override
    public String getPomme() {
        return realItem.pomme;
    }

    @Override
    public void setPomme(String pomme) {
        this.realItem.pomme = pomme;
    }

    @Override
    public String getPierre() {
        return realItem.pierre;
    }

    @Override
    public void setPierre(String pierre) {
        this.realItem.pierre = pierre;
    }


}
