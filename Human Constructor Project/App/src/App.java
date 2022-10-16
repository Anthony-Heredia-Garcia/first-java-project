public class App {
    public static void main(String[] args) throws Exception {
       Human human = new Human("Rick", 21, false);
       Human human2 = new Human("Aszalea", 28, true);

       System.out.println(human.isAdmin);
       human2.printAdminAccess();
       human.printAdminAccess();
    }
}
