package com.example;

public class WordDocumentAdapter implements DocumentUploader {

    private final WordDocumentUploader wordDocumentUploader;

    public WordDocumentAdapter() {
        this.wordDocumentUploader = new WordDocumentUploader();
    }
    @Override
    public void upload() {
        wordDocumentUploader.uploadWordDocument();
    }
}
