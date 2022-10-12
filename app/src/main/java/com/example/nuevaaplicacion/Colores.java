package com.example.nuevaaplicacion;

import android.graphics.Color;

public class Colores{


    private int[] arrayColores,arrayColores1;
    private int pos=0,pest=0;

    public int getPest() {
        return pest;
    }

    public void setPest(int pest) {
        this.pest = pest;
    }


    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Colores(){
        int[] arr={Color.GREEN,Color.BLUE,Color.RED,Color.GRAY, Color.YELLOW};
        int[] arr1={Color.GRAY,Color.RED,Color.BLUE,Color.GREEN,Color.YELLOW};
        this.arrayColores=arr;
        this.arrayColores1=arr1;
    }

    public int genColor1(){
        if(this.getPos()>=this.getArrayColores1().length-1){
            this.setPos(0);
        }
        else
        {
            this.setPos(this.getPos()+1);
        }
        return this.getArrayColores1()[this.getPos()];
    }
    public int genColor(){

        if(this.getPest()>=this.getArrayColores().length-1){
            this.setPest(0);
        }
        else
        {
            this.setPest(this.getPest()+1);
        }
        return this.getArrayColores()[this.getPest()];
    }


    public int[] getArrayColores() {
        return arrayColores;
    }

    public int[] getArrayColores1() {
        return arrayColores1;
    }

    public void setArrayColores1(int[] arrayColores1) {
        this.arrayColores1 = arrayColores1;
    }

    public void setArrayColores(int[] arrayColores) {
        this.arrayColores = arrayColores;
    }
}
