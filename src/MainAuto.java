import controller.AutoController;

public class MainAuto {
    public static void main(String[] args) {
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
        ac.getAllAutos();
    }
}
