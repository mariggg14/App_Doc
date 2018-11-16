package com.example.austin.app_doc;

public class GrpItem {
    int grpEsc;
    String grpName;

    public  GrpItem(){

    }
    public GrpItem(int grpEsc, String grpName) {
        this.grpEsc = grpEsc;
        this.grpName = grpName;
    }

    public int getGrpEsc() {
        return grpEsc;
    }

    public String getGrpName() {
        return grpName;
    }

    public void setGrpEsc(int grpEsc) {
        this.grpEsc = grpEsc;
    }

    public void setGrpName(String grpName) {
        this.grpName = grpName;
    }
}
