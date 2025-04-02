import java.util.Scanner;
import java.util.ArrayList;

public class Vehicle {
    private String model;
    private String brand;
    private int max_speed;
    private int car_speed;

    Vehicle( String brand, String model,int max_speed){
        this.brand = brand;
        this.model = model;
        this.max_speed = max_speed;
    }


    public void setCar_speed(int car_speed) {
        this.car_speed = car_speed;
    }


    public int getMax_speed() {
        return max_speed;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getCar_speed() {
        return car_speed;
    }
    void getSettings(){
        System.out.println("Model: " + getModel());
        System.out.println("Brand: " + getBrand());
        System.out.println("Speed: " + getCar_speed() + " km/h ");
    }
}
