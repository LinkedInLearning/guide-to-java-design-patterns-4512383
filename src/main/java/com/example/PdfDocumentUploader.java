package com.example;

public class PdfDocumentUploader implements DocumentUploader {


    @Override
    public void upload() {
        System.out.println("Preparing PDF document...");
        System.out.println("Uploading PDF document");
    }
}
