package services;

import models.Paragraph;

public class AlignCenter  implements  AlignStrategy {
    public Paragraph render(Paragraph p){
        p.setText("_____"+p.getText()+"_____");
        return p;
    }
}
