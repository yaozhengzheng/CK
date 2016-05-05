package com.edu.feicui.ck.bean;

/**
 * Created by 16245 on 2016/05/04.
 */
public class TelclassInfo {
    public String name;
    //唯一 ID
    public int idx;
    //重写构造方法
    public TelclassInfo(String name, int idx) {
        super();
        this.name = name;
        this.idx = idx;
    }
    //系统默认构造方法
    public TelclassInfo() {
        super();
    }
}

