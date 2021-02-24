package com.company;

import java.util.Scanner;

public class HinhTron {
    private Diem tam;
    private double bankinh;
    public HinhTron(){}
    public HinhTron(Diem tam, double bankinh){
        this.tam = tam;
        this.bankinh = bankinh;
    }

    public Diem getTam() {
        return tam;
    }

    public void setTam(Diem tam) {
        this.tam = tam;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    @Override
    public String toString() {
        return "Hình tròn tâm "+ tam.toString() + "; bán kính :"+ bankinh;
    }

    public double DienTich(){
        return 3.14*bankinh*bankinh;
    }
    public double ChuVi(){
        return 3.14*2*bankinh;
    }
    public void Khoangcach(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tọa độ x y của đường tròn khác : ");
        Diem d = new Diem(sc.nextInt(), sc.nextInt());
        System.out.println("Nhập bán kính của đường tròn tâm "+ d.toString());
        double bk = sc.nextDouble();

        System.out.println("Khoảng cách tới hình tròn tâm "+d.toString()+" bán kính "+bk+" là : "+ d.distance(tam));
    }





}
