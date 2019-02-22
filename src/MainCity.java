import controller.CityController;

public class MainCity {
    public static void main(String[] args) {
        CityController cc = new CityController();
        cc.insertIntoCity("Grudziądz", 95000., 59.1);
        cc.insertIntoCity("Bydgoszcz", 320000., 170.5);
        cc.insertIntoCity("Toruń", 250000., 115.6);
        cc.selectFromCity();
        cc.selectFromCityById(1);
        cc.selectFromCityById(10);

    }
}
