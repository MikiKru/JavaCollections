import controller.UserController;

public class MainUser {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser("mk","mk");
        uc.addUser("kk","kk");
        uc.addUser("xxx","xxx");
        uc.addUser("mk","mk");
        uc.deleteUser("mk");
        uc.deleteUser("ssss");
        uc.showUsers();

        uc.changePassword(
                "kk",
                "kk",
                "nowe",
                "nowe");
        uc.changePassword(
                "123",
                "kk",
                "nowe",
                "nowe");
        uc.changePassword(
                "kk",
                "kk",
                "nowe1",
                "nowe");
        uc.showUsers();
    }
}
