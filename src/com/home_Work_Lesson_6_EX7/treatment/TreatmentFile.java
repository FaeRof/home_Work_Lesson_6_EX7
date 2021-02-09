package com.home_Work_Lesson_6_EX7.treatment;

public abstract class TreatmentFile {
    protected long size;
    protected String authorName;
    protected String date;
    protected String extension;

    public TreatmentFile(long size, String authorName, String date){
        this.size = size;
        this.authorName = authorName;
        this.date = date;
    }

    public TreatmentFile(long size, String authorName) {
        this.size = size;
        this.authorName = authorName;
    }


    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
