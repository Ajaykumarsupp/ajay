public class Student {
    String name;
    int id;
    int age;
    String branch;

    public void makeNoice(){
        System.out.println("Devara mungita nuvventha");
    }
    public void study(){
        System.out.println("bhAAi is studying");
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        Student s = new Student();
        System.out.println(s.name);
        s.name = "Chiru";
        s.id = 507;
        s.age = 10;
        s.branch = "CSE";
        System.out.println(s);
        System.out.println(s.id);
        System.out.println(s.age);
        System.out.println(s.branch);
    }
}
