import controller.CityController;

import java.io.IOException;

public class MainCity {
    public static void main(String[] args) throws IOException {
        CityController cc = new CityController();
        cc.insertIntoCity("Grudziądz", 95000., 59.1);
        cc.insertIntoCity("Bydgoszcz", 320000., 170.5);
        cc.insertIntoCity("Toruń", 250000., 115.6);
        cc.selectFromCity();
        cc.selectFromCityById(1);
        cc.selectFromCityById(10);
        cc.deleteFromCityById(3);
        cc.selectFromCity();
        cc.saveCityTableData();
//        cc.updateCityValueById(1,44444.);

    }
}
