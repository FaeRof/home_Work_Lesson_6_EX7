package com.home_Work_Lesson_6_EX7.treatment;

public class TreatmentFb2 extends TreatmentFile{
    private String placeOnComputer;

    public TreatmentFb2(long size, String authorName, String date, String placeOnComputer){
        super(size, authorName, date);
        this.placeOnComputer = placeOnComputer;
    }


    public static void isFilesInOneFolder(TreatmentFb2 fb2File1, TreatmentFb2 fb2File2){
        if (fb2File1.getPlaceOnComputer().equals(fb2File2.getPlaceOnComputer())){
            System.out.println("Books in the one folder on the computer.");
        } else {
            System.out.println("Books in different folders on the computer.");
        }
    }


    public String getPlaceOnComputer() {
        return placeOnComputer;
    }

    public void setPlaceOnComputer(String placeOnComputer) {
        this.placeOnComputer = placeOnComputer;
    }

}
