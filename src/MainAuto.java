import controller.AutoController;

import java.io.IOException;

public class MainAuto {
    public static void main(String[] args) throws IOException {
        AutoController ac = new AutoController();
        ac.addAuto(
                "321312VDG2321",
                "VW",
                "Passat",
                150000);
        ac.addAuto(
                "FC1312VDG2321",
                "VW",
                "Golf",
                80000);
        ac.addAuto(
                "ER1312VDG2321",
                "VW",
                "Tiguan",
                120000);
        ac.addAuto(
                "ER1312DVG2321",
                "VW",
                "POLO",
                50000);
        ac.addAuto(
                "ER131233VD321",
                "Audi",
                "A3",
                125000);
        ac.addAuto(
                "ER1312VD52321",
                "Audi",
                "A5",
                170000);
        ac.addEqupment("321312VDG2321", "A");
        ac.addEqupment("321312VDG2321", "C");
        ac.getAllAutos();
        ac.deleteAutoByVin("ER1312VDG2321");
        ac.deleteEqipment("321312VDG2321","A");
        ac.getAllAutos();
        ac.saveDataToFile("MyFile.txt");
    }
}
