public class Employee {
        String name, address;
        int year;
        Employee(String n, int y, String a) {
            name = n;
            year = y;
            address = a;}
        void display() {
            System.out.println(name + "  " + year + "  " + address);
        }
        public static void main(String[] args) {
            Employee e1 = new Employee("Robert", 1994, "64C- WallsStreat");
            Employee e2 = new Employee("Sam", 2000, "68D- WallsStreat");
            Employee e3 = new Employee("John", 1999, "26B- WallsStreat");
            System.out.println("Name  Year  Address");
            e1.display();
            e2.display();
            e3.display();
        }
    }