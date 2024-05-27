package com.random.zikirmatik.Hisnulmuslim;

import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class LandMark implements Serializable {
    String listeName;
    String listeImageBir;
    String listeImageIki;


    public  LandMark(String listeName,String listeImageBir,String listeImageIki){
        this.listeName=listeName;
        this.listeImageBir=listeImageBir;
        this.listeImageIki=listeImageIki;
    }



    public String getListeName() {
        return listeName;
    }
}
