class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;

    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}

public class OopBasics1 {
    public static void main(String[] args) {
        Employee yachna = new Employee();
        yachna.setName("code with yachna");
        yachna.salary = 200;
        System.out.println(yachna.getSalary());
        System.out.println(yachna.getName());
        
    }
}
