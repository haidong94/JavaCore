package com.example.hhdong.myapplication;

/**
 * Created by hhdong on 11/15/2017.
 */

public class DemoEnum {
    public static void main(String[] args) {

        Light light = Light.L1;
        System.out.println("Location: " + light.getLocation());
        System.out.println("State: " + light.getState());

        System.out.println("All location Light ");
        for (Light light1 : Light.values()) {
            System.out.println(light1.getLocation());
        }



        System.out.println("Light "+ light);
    }
}
