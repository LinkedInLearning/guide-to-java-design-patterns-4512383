package com.example;

public class App {

    public static void main(String[] args) {
        var documentUploader = new PdfDocumentUploader();
        var onlineApplication = new OnlineApplication(documentUploader);
        onlineApplication.uploadDocument();
    }

}
