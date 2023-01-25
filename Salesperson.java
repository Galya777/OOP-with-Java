package lab9a_zad1a;

public class Salesperson {
    private String name;
    private double salary;
    private int numsales;

    public Salesperson(String name, double salary, int numsales)
    {
        this.name = name;
        this.salary = salary;
        this.numsales = numsales;
    }
    public void addBonus(double amount)
    {
        salary += amount;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNumSales()
    {
        return numsales;
    }
    public double getSalary()
    {
        return salary;
    }
    public void printNumSales (Salesperson obj){
        System.out.println(obj.getNumSales());
    }
    @Override
    public String toString()
    {
        return String.format("name: %s, salary: %.2f numsales: %d",
                name, salary, numsales);
    }
}

