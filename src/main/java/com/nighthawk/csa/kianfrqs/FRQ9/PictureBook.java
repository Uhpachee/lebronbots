package com.nighthawk.csa.kianfrqs.FRQ9;

public class PictureBook extends Book {

    private String illustrator;
    public PictureBook(String t, String a, String i) {
        super(t, a);
        illustrator = i;
    }

    public void printBookInfo()
    {
        super.printBookInfo();
        System.out.println(" and illustrated by" + illustrator);
    }
}
