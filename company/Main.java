package com.company;
//bai6 trang 113 nhe
public class Main {
    public static void main(String[] args) {
        Diem tam = new Diem(1,2);
        HinhTron tron = new HinhTron(tam, 19);

        System.out.println("Diện tích hình tròn là : " + tron.DienTich());
        System.out.println("Chu vi hình tron là : " + tron.ChuVi());
        System.out.println(tron.toString());
        tron.Khoangcach();
        
    }
}

