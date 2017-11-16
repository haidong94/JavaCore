package com.example.hhdong.myapplication.model;

/**
 * Created by hhdong on 11/14/2017.
 */

public class TamGiac {
    private int chieuCao;
    private int soBatDau;

    public int getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(int chieuCao) {
        this.chieuCao = chieuCao;
    }

    public int getSoBatDau() {
        return soBatDau;
    }

    public void setSoBatDau(int soBatDau) {
        this.soBatDau = soBatDau;
    }

    public TamGiac(int chieuCao, int soBatDau) {
        this.chieuCao = chieuCao;
        this.soBatDau = soBatDau;
    }

    public TamGiac() {
    }

    public void VeTamGiacDemo(){
        for(int i=0;i<chieuCao;i++){
            for(int j=0;j<chieuCao-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<i*2+1;j++)
            {
                System.out.print(soBatDau);
            }

            System.out.print("\n");
            soBatDau+=1;
        }
    }

    public void VeTamGiacBai1(){
        for(int i=0;i<chieuCao;i++){
            for(int j=0;j<chieuCao-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<i*2+1;j++)
            {
                System.out.print(j+1);
            }

            System.out.print("\n");
        }
    }

    public void VeTamGiacBai2(){
        //nua tren
        for(int i=chieuCao/2;i>0;i--){
            System.out.print("\n");
            for(int j=0;j<chieuCao/2-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<i*2-1;j++)
            {
                System.out.print("*");
            }


        }

        System.out.print("\n");
        //nua duoi
        for(int i=2;i<chieuCao/2+1;i++){
            for(int j=0;j<chieuCao/2-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<i*2-1;j++)
            {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
