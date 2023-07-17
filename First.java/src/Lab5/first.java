package Lab5;

class employee {
    String name;
    int yoj;
    int salary;
    String address;
}

public class first {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.name = "Lekshmi";
        e1.yoj = 1994;
        e1.address = "64C-Valliakavu";
        e1.salary = 35000;

        employee e2 = new employee();
        e2.name = "Lekshmi";
        e2.yoj = 1994;
        e2.address = "64C-Valliakavu";
        e2.salary = 35000;

        employee e3 = new employee();
        e3.name = "Lekshmi";
        e3.yoj = 1994;
        e3.address = "64C-Valliakavu";
        e3.salary = 35000;

        System.out.println("Name" + "\t" + "Year of joining" + "\t" + "Address" + "\t" + "Salary");
        System.out.println(e1.name + "\t" + e1.yoj + "\t" + e1.address + "\t" + e1.salary);
        System.out.println(e2.name + "\t" + e2.yoj + "\t" + e2.address + "\t" + e2.salary);
        System.out.println(e3.name + "\t" + e3.yoj + "\t" + e3.address + "\t" + e3.salary);
    }
}
