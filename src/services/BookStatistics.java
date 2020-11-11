package services;

import models.*;

public class BookStatistics implements  Visitor{
    int images=0;
    int proxyimages=0;
    int tables =0;
    int paragraphes=0;
    int sections=0;


    public BookStatistics() {}
    @Override
    public void visit(Image image) {
        images++;
    }

    @Override
    public void visit(ImageProxy imageProxy) {
        proxyimages++;
    }

    @Override
    public void visit(Table table) {
        tables++;
    }

    @Override
    public void visit(Paragraph paragraph) {
        paragraphes++;
    }

    @Override
    public void visit(Section section) {
        sections++;
    }

    public void printStatistics(){
        System.out.println("Images: "+this.images);
        System.out.println("ProxyImages: "+this.proxyimages);
        System.out.println("Tables: "+this.tables);
        System.out.println("Paragraphes: "+this.paragraphes);
        System.out.println("Sections: "+this.sections);
    }
}
