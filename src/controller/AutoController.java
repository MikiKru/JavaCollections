package controller;

import model.Auto;

import java.util.ArrayList;
import java.util.List;

public class AutoController {
    private List<Auto> ordered_autos = new ArrayList<>();

    public void addAuto(String vin_no, String brand, String model, double price_basic){
        Auto a = new Auto(vin_no, brand, model, price_basic);
        ordered_autos.add(a);
        System.out.println("Zamówienie przyjęte! " + a);
    }
    public void addEqupment(String vin, String name){
        // szukam auta po vin
        for(int i = 0; i < ordered_autos.size(); i++){
            if(ordered_autos.get(i).getVin_no().equals(vin)){
                ordered_autos.get(i).setEquipmentOrderByName(name);
            }
        }
    }

    public void getAllAutos(){
        ordered_autos.forEach(auto -> System.out.println(auto));
    }

}
