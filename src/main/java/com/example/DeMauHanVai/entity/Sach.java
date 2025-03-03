package com.example.DeMauHanVai.entity;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private float gia;

    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, float gia) {
        this.maSach = maSach;
        setTenSach(tenSach);
        setTacGia(tacGia);
        setNamXuatBan(namXuatBan);
        setGia(gia);
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        if (tenSach == null || tenSach.isEmpty()){
            throw new IllegalArgumentException("tên sách không để trống");
        }
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        if (tacGia.isEmpty() || tacGia == null){
            throw new IllegalArgumentException("tác giả không để trống");

        }
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        if (namXuatBan < 0 || namXuatBan >2025){
            throw new IllegalArgumentException("năm xuất bản không hợp lệ");

        }
        this.namXuatBan = namXuatBan;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        if (gia < 0){
            throw new IllegalArgumentException("giá phải lớn hơn 0");

        }
        this.gia = gia;
    }
}
