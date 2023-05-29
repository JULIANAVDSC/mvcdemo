package br.fatecrl.mvcdemo.models;


public class ShoesModels {
    private String brand;
    private String color;
    private  double size;


    public ShoesModels(String brand, String color, double size){
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    public static void add(ShoesModels ShoesModels) {
    }

    public String getBrand() {
        return brand;
    }

    public String getColor(){
        return color;
    }

    public double getSize() {
        return size;
    }

}
