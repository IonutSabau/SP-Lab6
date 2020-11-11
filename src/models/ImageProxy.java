package models;

import services.Visitor;

public class ImageProxy implements Element{

    private String name;
    private Image realImage= null;

    public ImageProxy(String name){
        this.name=name;
    }

    public void print() {
        if (this.realImage == null){
            this.realImage = new Image(this.name);
        }
        realImage.print();
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}