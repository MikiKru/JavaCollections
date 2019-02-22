package controller;

import model.Auto;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
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
    // -----------USUWANIE AUTA-----------------------------------
    public void deleteAutoByVin(String vin){
        for(int i = 0; i < ordered_autos.size(); i++){
            if(ordered_autos.get(i).getVin_no().equals(vin)){
                System.out.println("Usunięto auto" + ordered_autos.get(i));
                ordered_autos.remove(i);
            }
        }
    }
    // -----------USUWANIE WYPOSAŻENIA---------------------------
    public void deleteEqipment(String vin, String eq_name){
        for(int i = 0; i < ordered_autos.size(); i++){
            if(ordered_autos.get(i).getVin_no().equals(vin)){
                System.out.println("Usunięto wyposażenie");
                ordered_autos.get(i).setEquipmentOrderByName(eq_name);
            }
        }
    }
    // ----------DODAWANIE ZAMÓWIEN DO PLIKU---------------------
    public void saveDataToFile(String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);
        fw.write(String.format("%15s | %10s | %10s | %15s | %30s | %15s \n",
                "VIN","MARKA","MODEL","CENA","WYPOSAŻENIE", "SUMA"));
        for(Auto a : ordered_autos) {
            fw.write(a.toString()+"\n");
        }
        fw.write("\n\nDATA: " + LocalDate.now());
        fw.close();
    }
    // ---------------------------------------------------------
    public void getAllAutos(){
        ordered_autos.forEach(auto -> System.out.println(auto));
    }

}
