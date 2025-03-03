package com.example.DeMauHanVai.service;

import com.example.DeMauHanVai.entity.Sach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SachServiceTest {
    private SachService sachService;
    @BeforeEach
    void setUp() {
        sachService = new SachService();
    }

    @Test
    void update() {
        Sach sach = new Sach("ma1", "a", "h", 2000, 200);
        Sach sach2 = new Sach("ma2", "a", "h", 2000, 200);
        sachService.add(sach);
        sachService.add(sach2);

        sach.setMaSach("ma2");
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> sachService.update(sach));
        assertEquals("mã không được trùng", exception.getMessage());
    }

    @Test
    void updateValid(){
        Sach sach = new Sach("ma1", "a", "h", 2000, 200);
        sachService.add(sach);

        sach.setTenSach("b");
        sachService.update(sach);
        assertEquals("b", sachService.getSachByMaSach("ma1").getTenSach());
    }



    @Test
    void updateWithTenNull(){

        Exception exception = assertThrows(IllegalArgumentException.class, ()-> sachService.update(new Sach("ma1", "", "a", 122, 3232)));
        assertEquals("tên sách không để trống", exception.getMessage());

    }

    @Test
    void updateTacGiaNull (){
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> sachService.update(new Sach("ma1", "ads", "", 122, 3232)));
        assertEquals("tác giả không để trống", exception.getMessage());
    }

    @Test
    void updateWithInvalidNam (){
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> sachService.update(new Sach("ma1", "ads", "áds", -1, 3232)));
        assertEquals("năm xuất bản không hợp lệ", exception.getMessage());
    }

    @Test
    void updateWithInvalidNam2025 (){
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> sachService.update(new Sach("ma1", "ads", "áds", 2027, 3232)));
        assertEquals("năm xuất bản không hợp lệ", exception.getMessage());
    }

    @Test
    void updateWithInvalidGia (){
        Exception exception = assertThrows(IllegalArgumentException.class, ()-> sachService.update(new Sach("ma1", "ads", "áds", 2000, -1)));
        assertEquals("giá phải lớn hơn ", exception.getMessage());
    }

}