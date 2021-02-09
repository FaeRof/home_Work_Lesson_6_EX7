package com.home_Work_Lesson_6_EX7.treatment;

public class TreatmentTxt extends TreatmentFile{
    private String fileName;
    private String sourceName;

    public TreatmentTxt(long size, String authorName, String fileName, String sourceName){
        super(size,authorName);
        this.fileName = fileName;
        this.sourceName = sourceName;
    }


    public static void isTXTFilesFromOneSource(TreatmentTxt txtFile1, TreatmentTxt txtFile2){
        if (txtFile1.getSourceName().equals(txtFile2.getSourceName())){
            System.out.println("Those txt files from one source.");
        } else {
            System.out.println("Those txt files from different sources.");
        }
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }
}
