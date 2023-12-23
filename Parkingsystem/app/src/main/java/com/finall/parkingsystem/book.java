package com.finall.parkingsystem;

public class book {
    private final String rdescription;
    private final String rtitle ;
    // بم ان الصوره مكونه من مجموعه من البيكسل يبقى كده عباره عن شويه ارقام
    private final int rimgs;

    public   book(String title,String description,int img){
        rdescription =description;
        rtitle= title;
        rimgs=img;
    }

    public String getRdescription() {
        return rdescription;
    }

    public String getRtitle() {
        return rtitle;
    }

    public int getRimgs() {
        return rimgs;
    }

}
