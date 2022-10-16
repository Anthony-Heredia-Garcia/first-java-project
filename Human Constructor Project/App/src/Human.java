public class Human {
  String name;
  int age;
  boolean isAdmin;

  Human(String name, int age, boolean isAdmin){
    this.name = name;
    this.age = age;
    this.isAdmin = isAdmin;
  }

  void printAdminAccess(){
    if (this.isAdmin){
      System.out.println(this.name+" is an Admin");
    } else {
      System.out.println(this.name+" is not an Admin");
    }
  }

}
