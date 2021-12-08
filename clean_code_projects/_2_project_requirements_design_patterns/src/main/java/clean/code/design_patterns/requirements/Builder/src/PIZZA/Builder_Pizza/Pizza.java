package clean.code.design_patterns.requirements.Builder.src.PIZZA.Builder_Pizza;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class Pizza {
    private  String ingredient1; // obligatoriu
    private  String ingredient2; // obligatoriu
    private  String ingredient3; //optional
    private  String ingredient4; // optional
    private  String ingredient5; // optional
    private  String ingredient6; // optional
    private  String ingredient7; // optional
    private  String ingredient8; // optional
    private  String ingredient9; // optional
    private  String ingredient10; // optional
    private  String ingredient11; // optional
    private  String ingredient12; // optional
    private  String ingredient13; // optional
    private  String ingredient14; //optional
    private  String ingredient15; // optional
    private  String ingredient16; // optional
    private  String ingredient17; // optional
    private  String ingredient18; // optional
    private  String ingredient19; // optional
    private  String ingredient20; // optional
    private  String ingredient21; // optional
    private  float pret_final; // obligatoriu, nu e la alegere :)

    private Pizza(){}
    private int number = 1;

    private Map<String,String> lines = new LinkedHashMap<>();
    private void addToFormatter(String incredient, String text){
        if(Objects.nonNull(text)){
            lines.put(incredient, "[" +  "ingredient" + number + " : " + text + "]");
            number += 1;
        }
    }


    public String getFormatter() {
        StringBuilder builder = new StringBuilder();
        for(String value : lines.values()){
            builder.append(value);
            builder.append("\n");
        }
        return builder.toString();
    }

    public static class Builder implements Serializable{
        private Pizza pizza = new Pizza();

        public Builder(){
        }

        public Builder ingredient1(String ingredient1) {
            this.pizza.ingredient1 = ingredient1;
            this.pizza.addToFormatter("incredient1", ingredient1);
            return this;
        }

        public Builder ingredient2(String ingredient2) {
            this.pizza.ingredient2 = ingredient2;
            this.pizza.addToFormatter("incredient2", ingredient2);
            return this;
        }

        public Builder ingredient3(String ingredient3) {
            this.pizza.ingredient3 = ingredient3;
            this.pizza.addToFormatter("incredient3", ingredient3);

            return this;
        }

        public Builder ingredient4(String ingredient4) {
            this.pizza.ingredient4 = ingredient4;
            this.pizza.addToFormatter("incredient4", ingredient4);

            return this;
        }

        public Builder ingredient5(String ingredient5) {
            this.pizza.ingredient5 = ingredient5;
            this.pizza.addToFormatter("incredient5", ingredient5);
            return this;
        }

        public Builder ingredient6(String ingredient6) {
            this.pizza.ingredient6 = ingredient6;
            this.pizza.addToFormatter("incredient6", ingredient6);
            return this;
        }

        public Builder ingredient7(String ingredient7) {
            this.pizza.ingredient7 = ingredient7;
            this.pizza.addToFormatter("incredient7", ingredient7);
            return this;
        }

        public Builder ingredient8(String ingredient8) {
            this.pizza.ingredient8 = ingredient8;
            this.pizza.addToFormatter("incredient8", ingredient8);
            return this;
        }

        public Builder ingredient9(String ingredient9) {
            this.pizza.ingredient9 = ingredient9;
            this.pizza.addToFormatter("incredient9", ingredient9);

            return this;
        }

        public Builder ingredient10(String ingredient10) {
            this.pizza.ingredient10 = ingredient10;
            this.pizza.addToFormatter("incredient10", ingredient10);

            return this;
        }

        public Builder ingredient11(String ingredient11) {
            this.pizza.ingredient11 = ingredient11;
            this.pizza.addToFormatter("incredient11", ingredient11);
            return this;
        }

        public Builder ingredient12(String ingredient12) {
            this.pizza.ingredient12 = ingredient12;
            this.pizza.addToFormatter("incredient12", ingredient12);
            return this;
        }

        public Builder ingredient13(String ingredient13) {
            this.pizza.ingredient13 = ingredient13;
            this.pizza.addToFormatter("incredient13", ingredient13);
            return this;
        }

        public Builder ingredient14(String ingredient14) {
            this.pizza.ingredient14 = ingredient14;
            this.pizza.addToFormatter("incredient14", ingredient14);
            return this;
        }

        public Builder ingredient15(String ingredient15) {
            this.pizza.ingredient15 = ingredient15;
            this.pizza.addToFormatter("incredient15", ingredient15);
            return this;
        }

        public Builder ingredient16(String ingredient16) {
            this.pizza.ingredient16 = ingredient16;
            this.pizza.addToFormatter("incredient16", ingredient16);
            return this;
        }

        public Builder ingredient17(String ingredient17) {
            this.pizza.ingredient17 = ingredient17;
            this.pizza.addToFormatter("incredient17", ingredient17);
            return this;
        }

        public Builder ingredient18(String ingredient18) {
            this.pizza.ingredient18 = ingredient18;
            this.pizza.addToFormatter("incredient18", ingredient18);
            return this;
        }

        public Builder ingredient19(String ingredient19) {
            this.pizza.ingredient19 = ingredient19;
            this.pizza.addToFormatter("incredient19", ingredient19);
            return this;
        }

        public Builder ingredient20(String ingredient20) {
            this.pizza.ingredient20 = ingredient20;
            this.pizza.addToFormatter("incredient20", ingredient20);
            return this;
        }

        public Builder ingredient21(String ingredient21) {
            this.pizza.ingredient21 = ingredient21;
            this.pizza.addToFormatter("incredient21", ingredient21);
            return this;
        }

        public Builder pret_final(float pret_final) {
            this.pizza.pret_final = pret_final;
            return this;
        }

        private Pizza reset(){
            Pizza aux = this.pizza;
            this.pizza = new Pizza();
            return aux;
        }

        public Pizza build(){
            return reset();
        }

    }

    }



