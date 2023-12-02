package com.example;

public class WordDocumentAdapter extends WordDocumentUploader implements DocumentUploader {

    @Override
    public void upload() {
        uploadWordDocument();
    }

    @Override
    public void uploadWordDocument() {
        System.out.println("Preparing Word document...");
        System.out.println("Uploading Word document");
    }
}
