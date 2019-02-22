package controller;

import model.City;

import java.io.FileWriter;
import java.io.IOException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityController {
    private static Integer id = 0;
    private Map<Integer, List> city_table = new HashMap<>();

    public boolean insertIntoCity(String name, Double population, Double area){
        // towrzymy obiekt klasy City - tworzymy rekord do bazy
        City c = new City(name, population, area);
        // zapisać obiekt w mapie o danym id - zapis w tabelce
        city_table.put(++id, c.getCity());
        System.out.println("Dodano rekord: " + c);
        return true;
    }
    public void selectFromCity(){
        city_table.forEach((key, value) -> System.out.println(key + ":" + value));
    }
    public void selectFromCityById(Integer id){
        if(city_table.get(id) != null) {
            System.out.println("Wyszukano:" + city_table.get(id));
        } else {
            System.out.println("Brak rekordu o id="+id);
        }
    }
    public boolean deleteFromCityById(Integer id){
        if(city_table.get(id) != null) {
            System.out.println("Wyszukano:" + city_table.remove(id));
            return true;
        } else {
            System.out.println("Brak rekordu o id="+id);
            return false;
        }
    }
    public void saveCityTableData() throws IOException {
        FileWriter fw = new FileWriter("database_data.txt");
        for(Map.Entry<Integer,List> record : city_table.entrySet()){
            fw.write(record.toString()+"\n");
        }
        fw.close();
    }
//    public boolean updateCityValueById(Integer id, Double population){
//        System.out.println(city_table.get(id).get(1));
//        return true;
//    }


}
