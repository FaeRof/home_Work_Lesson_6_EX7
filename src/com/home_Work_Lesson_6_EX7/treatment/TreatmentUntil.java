package com.home_Work_Lesson_6_EX7.treatment;

public class TreatmentUntil {
    public static TreatmentFile createDefaultFile(String type) {
        TreatmentFile file = null;
        switch (type){
            case ("txt"):
                file = new  TreatmentTxt(0, "unknownAuthor", "unknownName","unknownSource");
                System.out.println("default txt file was created");
                break;
            case("pdf"):
                file = new TreatmentPdf(0,"unknownAuthor", 0, 0);
                System.out.println("default pdf file was created");
                break;
            case("fb2"):
                file = new TreatmentFb2(0,"unknownAuthor","unknownDate", "unknownPlace");
                System.out.println("default fb2 file was created");
                break;
            default:
                System.out.println("unknown type of file. File wasn't created");
                break;
        }

        if (file.equals(null)){
            System.out.println("Unknown type of file. File wasn't created");
            throw new NullPointerException();
        }

        return file;
    }


    public static void updateFile(TreatmentFile file){
        System.out.println(file.getExtension() + " file was updated");
    }

    public static void readingFile(TreatmentFile file){
        System.out.println("Reading " + file.getExtension() + " file...");
    }

    public static void delete(TreatmentFile file){
        System.out.println("File was deleted!");
    }
}
