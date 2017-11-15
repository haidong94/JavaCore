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

    public void VeTamGiacBai9(){
        for(int i=chieuCao;i>0;i--){
            for(int j=0;j<chieuCao-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=0;j<i;j++)
            {
                System.out.print(i-j);
            }
            for(int j=0;j<i-1;j++)
            {
                System.out.print(j+2);
            }
            System.out.print("\n");
        }
    }

    public void VeTamGiacBai10() {
        for (int i = 0; i < chieuCao; i++) {
            for (int j = 0; j < chieuCao - i; j++) {
                System.out.print(" ");
            }
            System.out.print(i + 1);

            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            System.out.print(i + 1);

            System.out.print("\n");
        }

        for (int i = chieuCao - 1; i > 0; i--) {
            for (int j = 0; j < chieuCao - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.print(i);

            for (int j = 0; j < i * 2 - 2; j++) {
                System.out.print(" ");
            }
            System.out.print(i);

            System.out.print("\n");
        }
    }


    public void VeTamGiacBai11(){
        for(int i=0;i<=chieuCao;i++){
            for(int k=i;k>0;k--){
                System.out.print(k);
            }
            for(int j=0;j<=chieuCao;j++)
            {
                if(i==j)
                    System.out.print(0);
            }
            for(int k=0;k<i;k++){
                System.out.print(k+1);
            }


            System.out.print("\n");
        }
    }




}
