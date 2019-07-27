package com.aliyu010.uchat;

public class Message {
    private String mMessage;
    private String mName;
    private String mDocument;


    public Message() {
    }

    public Message(String message, String name, String document) {
        mMessage = message;
        mName = name;
        mDocument = document;
    }


    public String getMessag() {
        return mMessage;
    }

    public void setMessag(String messag) {
        mMessage = messag;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDocument() {
        return mDocument;
    }

    public void setDocument(String document) {
        mDocument = document;
    }


}
