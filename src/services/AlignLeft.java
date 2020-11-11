package services;

import models.Paragraph;

public class AlignLeft implements  AlignStrategy{
    public Paragraph render(Paragraph p){
        p.setText(p.getText()+"__________");
        return p;
    }
}
