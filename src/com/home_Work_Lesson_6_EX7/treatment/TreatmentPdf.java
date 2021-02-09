package com.home_Work_Lesson_6_EX7.treatment;

public class TreatmentPdf extends TreatmentFile{
    private int pages;
    private int pictures;

    public TreatmentPdf(long size, String authorName, int pages, int pictures){
        super(size,authorName);
        this.pages = pages;
        this.pictures = pictures;
    }

    public static void isPicturesByOneAuthor(TreatmentPdf pdfFile1, TreatmentPdf pdfFile2){
        if (pdfFile1.getAuthorName().equals(pdfFile2.getAuthorName()) && (pdfFile1.getPictures() == pdfFile2.getPictures())){
            System.out.println("Those pictures in pdf files by one author");
        } else {
            System.out.println("Those pictures in pdf files by different author");
        }
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPictures() {
        return pictures;
    }

    public void setPictures(int pictures) {
        this.pictures = pictures;
    }
}
