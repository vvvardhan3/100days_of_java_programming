package collections.collection.list;

public class employee {
    public String name;
    public int id;
    public double salary;
    public String country;

    public employee(String name, int id, double salary, String country) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.country = country;
    }

    public double getSalary(){
        return salary;
    }

    public String getCountry() {
        return country;
    }
    

    @Override
    public String toString() {
        return "{" +
               "'" + name + '\'' +
               ", " + id +
               ", " + salary +
               ", '" + country + '\'' +
               '}';
    }
}
