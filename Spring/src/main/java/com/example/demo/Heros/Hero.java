package com.example.demo.Heros;

public class Hero {
    private int id;
    private String name;
    private int hp;
    private String type;

    public Hero(int pId, String pName, int pHp, String pType){
        this.id = pId;
        this.name = pName;
        this.hp = pHp;
        this.type = pType;

    }
    public Hero(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public String getType() {
        return type;
    }
}
