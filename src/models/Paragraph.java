package models;

import services.AlignStrategy;
import services.Visitor;

public class Paragraph implements Element {
    private String text;

    @Override
    public void print()
    {
        System.out.println("models.Paragraph: " + this.text);
    }

    public Paragraph(String text) {

        this.text = text;

    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy strategy){
        this.text = strategy.render(this).text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}