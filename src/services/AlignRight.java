package services;

import models.Paragraph;

public class AlignRight implements  AlignStrategy{
    public Paragraph render(Paragraph p){
        p.setText("__________"+p.getText());
        return p;
    }
}
