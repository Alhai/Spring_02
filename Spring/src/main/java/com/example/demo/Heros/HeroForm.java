package com.example.demo.Heros;

public class HeroForm {

        private int id;
        private String name;
        private int hp;
        private String type;

        public HeroForm(){

        }
        public HeroForm(int pId, String pName, int pHp, String pType){
            this.id = pId;
            this.name = pName;
            this.hp = pHp;
            this.type = pType;

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

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

