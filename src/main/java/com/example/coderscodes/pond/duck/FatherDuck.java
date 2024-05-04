package com.example.coderscodes.pond.duck;

public class FatherDuck {
    private String color = "white";
    private String noise = "quack";

    public FatherDuck(){

    }

    public FatherDuck(String noise){
        this.noise = noise;
    }

    private void quack() {
        System.out.println(noise);
    }
    protected void makeNoise() {
        quack();
    }

    @Override
    public String toString() {
        return "FatherDuck{" +
                "color='" + color + '\'' +
                ", noise='" + noise + '\'' +
                '}';
    }

    public static void main(String[] args) {
        FatherDuck fd = new FatherDuck("wak wak wak");
        System.out.println(fd);
//        fd.noise="wak wak wak";
//        System.out.println(fd.noise);
//        fd.quack();
//        fd.makeNoise();
    }
}
