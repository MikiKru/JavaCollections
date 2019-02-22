package controller;

import model.Auto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
//        FileWriter fw = new FileWriter(fileName, true);
//        fw.append(String.format("%15s | %10s | %10s | %15s | %30s | %15s \n",
//                "VIN","MARKA","MODEL","CENA","WYPOSAŻENIE", "SUMA"));
//        for(Auto a : ordered_autos) {
//            fw.append(a.toString()+"\n");
//        }
//        fw.append("\n\nDATA: " + LocalDate.now() + "\n");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Podpisz sie:");
//        fw.append("Podpis: " + sc.nextLine() + "\n");
//        sc.close();
//        fw.close();

        File file = new File("MyFile.txt");
        Scanner sc = new Scanner(file);
        System.out.println("File reading");
        while(sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
        sc.close();

    }
    // ---------------------------------------------------------
    public void getAllAutos(){
        ordered_autos.forEach(auto -> System.out.println(auto));
    }

}
