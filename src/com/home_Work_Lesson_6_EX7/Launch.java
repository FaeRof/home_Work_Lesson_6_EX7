package com.home_Work_Lesson_6_EX7;

import com.home_Work_Lesson_6_EX7.treatment.*;

import java.util.Scanner;

public class Launch {

   /* Написать проект для обработки пришедших в программу файлов, состоящий из нескольких классов.
    Файлы реально обрабатывать не будет(вернее будем, но через несколько занятий). Пока же пусть все методы выводят на консоль сообщения через System.out.println(ваш текст)
    Тип обрабатываемого файла будет вводиться с консоли(например, txt, pdf...).
    Для каждого типа файлов создать свой класс. Для всех типов файлов будет хранить следующие поля: размер файла, автор файла, дата создания файла.
    Так же придумать для каждого конкретного класса-файла еще пару своих собственных полей.
    Для каждого типа класса реализовать свой CRUD-обработчик. Причем метод удаления файла пусть будет одинаков для всех типов файлов и просто выводит на консоль строку "файл удален".
    Каждый класс, описывающий файл должен иметь конструктор с параметрами.
    Так же реализовать возможность сравнения двух экземпляров одного класса.
    Все логически схожие классы разместить по пакетам(мы эту тему еще не затрагивали, но давайте начнем ее в этом задании).
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                   // scanner opened
        System.out.println("Enter your file type: ");
        String type = scanner.nextLine();
        scanner.close();                                            // scanner closed

        TreatmentFile file = TreatmentUntil.createDefaultFile(type);
        file.setExtension(type);                                    // setting file extension
        TreatmentUntil.readingFile(file);
        TreatmentUntil.updateFile(file);
        TreatmentUntil.delete(file);
        System.out.println("  ");

        // checking if the comparison of files of the same type //
        TreatmentTxt txtFile1 = new TreatmentTxt(16000, "Petrov", "Brigantina", "Wikipedia");
        TreatmentTxt txtFile2 = new TreatmentTxt(16200, "Petrov", "Brigantina_2", "BooksStorage");
        TreatmentTxt txtFile3 = new TreatmentTxt(16420, "Petrov", "Brigantina", "Wikipedia");
        TreatmentTxt.isTXTFilesFromOneSource(txtFile1,txtFile2);
        TreatmentTxt.isTXTFilesFromOneSource(txtFile1,txtFile3);
        System.out.println(" ");

        TreatmentPdf pdfFile1 = new TreatmentPdf(16300, "Simonov", 26, 14);
        TreatmentPdf pdfFile2 = new TreatmentPdf(16920, "Simonova", 23, 14);
        TreatmentPdf pdfFile3 = new TreatmentPdf(16710, "Simonov", 26, 17);
        TreatmentPdf pdfFile4 = new TreatmentPdf(16730, "Simonov", 22, 14);
        TreatmentPdf.isPicturesByOneAuthor(pdfFile1, pdfFile2);
        TreatmentPdf.isPicturesByOneAuthor(pdfFile1, pdfFile3);
        TreatmentPdf.isPicturesByOneAuthor(pdfFile1, pdfFile4);
        System.out.println(" ");

        TreatmentFb2 fb2File1 = new TreatmentFb2(36200, "Ivanov", "05.09.2009", "C/: books");
        TreatmentFb2 fb2File2 = new TreatmentFb2(38900, "Karpov", "01.04.1963", "C/: books");
        TreatmentFb2 fb2File3 = new TreatmentFb2(36200, "Hvorin", "06.12.1757", "D/: books / MyBooks");
        TreatmentFb2.isFilesInOneFolder(fb2File1,fb2File2);
        TreatmentFb2.isFilesInOneFolder(fb2File1,fb2File3);
    }
}
