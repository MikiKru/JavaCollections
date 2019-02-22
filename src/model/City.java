package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class City {
    private String name;
    private Double population, area;

    Map<String, String> names = new HashMap<>();
    Map<String, Double> populations = new HashMap<>();
    Map<String, Double> areas = new HashMap<>();
    List<Map> city = new ArrayList<>();

    public City(String name, Double population, Double area) {
        this.name = name;
        this.population = population;
        this.area = area;
        // przypisanie wartoście do map
        names.put("name", name);
        populations.put("population", population);
        areas.put("area", area);
        // wprowadzenie map do listy map
        city.add(names);
        city.add(populations);
        city.add(areas);
    }
    @Override
    public String toString() {
        return String.format("| %20s | %20.2f | 20.2f |", name, population, area);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPopulation() {
        return population;
    }

    public void setPopulation(Double population) {
        this.population = population;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
