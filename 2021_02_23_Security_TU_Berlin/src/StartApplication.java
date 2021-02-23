/**
 * 16M-OOP
 * 23 10 : 16
 */
public class StartApplication {
    public static void main(String[] args) {
/*        Student sasha = new Student();
        sasha.study();
        sasha.eats();
        Teacher tch = new Teacher();*/
        Student glasha = new Student("Глаша", "Васечкина", "2021_021");
        System.out.println(glasha);
        System.out.println("------------------");
        Person ps = new Person();
        System.out.println(ps);
        System.out.println("------------------");
        System.out.println("учитель");
        Teacher tc = new Teacher();
        System.out.println(tc.toString());
    }
}
