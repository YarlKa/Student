public class StudentTest {
    public static void main(String[] args) {
        Student Student1 = new Student();
        Student Student2 = new Student();
        Student Student3 = new Student();
        double Sr1, Sr2, Sr3;

        Student1.Id = 1;
        Student1.Years = 1;
        Student1.Name = "Max";
        Student1.Surname = "Jons";
        Student1.Ec = 4.7;
        Student1.E = 3.9;
        Student1.M = 4.9;
        Student1.Sr = Student1.Sr();

        Student2.Id = 2;
        Student2.Years = 4;
        Student1.Name = "Sara";
        Student1.Surname = "Pits";
        Student2.Ec = 4.3;
        Student2.E = 4.2;
        Student2.M = 3.3;
        Student2.Sr = Student2.Sr();


        Student3.Id = 3;
        Student3.Years = 2;
        Student1.Name = "Jo";
        Student1.Surname = "Bush";
        Student3.Ec = 4.9;
        Student3.E = 4.1;
        Student3.M = 4.0;
        Student3.Sr = Student3.Sr();

        System.out.println(Student1.Id + " " + Student1.Years + " " + Student1.Name + " "
                + Student1.Surname + " " + Student1.Sr);
        System.out.println(Student2.Id + " " + Student2.Years + " " + Student2.Name + " "
                + Student2.Surname + " " + Student2.Sr);
        System.out.println(Student3.Id + " " + Student3.Years + " " + Student3.Name + " "
                + Student3.Surname + " " + Student3.Sr);

        Student3.Progul(0.5);
        Student2.Progul(0.2);
        Student1.Ocenka(0.3);

        System.out.println(Student3.Sr + " " + Student2.Sr + " " + Student1.Sr);


    }

}
