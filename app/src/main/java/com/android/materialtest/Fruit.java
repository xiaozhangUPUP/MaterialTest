package com.android.materialtest;

/**
 * Created by zhangqi on 2019/5/23
 */
public class Fruit {

    private String name;
    private int imgId;

    public Fruit(String name) {
        this.name = name;
    }

    public Fruit(String name, int imgId) {
        this.name = name;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
