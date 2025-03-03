package com.example.DeMauHanVai.service;

import com.example.DeMauHanVai.entity.Sach;

import java.util.ArrayList;
import java.util.List;

public class SachService {

    List<Sach> saches = new ArrayList<>();

    public void add (Sach sach){
        saches.add(sach);
    }

    public Sach getSachByMaSach(String ma){
        for (Sach sach: saches){
            if (sach.getMaSach()==ma){
                return sach;
            }
        }
        throw new IllegalArgumentException("không tồn tại");

    }

    public void update (Sach sach){
        int index=0;
        for (int i=0 ; i < saches.size(); ++i){
            if (saches.get(i).getMaSach() == sach.getMaSach()){
                saches.set(i, sach);
                for (int j=0 ; j< saches.size(); ++j){
                    if (saches.get(j).getMaSach() == sach.getMaSach()){
                        index++;
                    }
                }
                if (index>1){
                    throw new IllegalArgumentException("mã không được trùng");
                }
            }
        }
    }

}