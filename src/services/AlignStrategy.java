package services;

import models.Paragraph;

public interface AlignStrategy {
    public Paragraph render(Paragraph p);
}
