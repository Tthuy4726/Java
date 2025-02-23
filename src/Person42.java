public class Person42 {
    class PersonInfo {
    private String name;
    private String address;

    private String program;
    private int year;
    private double fee;

    private String school;
    private double pay;

    public PersonInfo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public PersonInfo(String name, String address, String program, int year, double fee) {
        this(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public PersonInfo(String name, String address, String school, double pay) {
        this(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    @Override
    public String toString() {
        if (program != null) {
            return "Student[Person[name=" + name + ", address=" + address + "], program=" + program + ", year=" + year + ", fee=" + fee + "]";
        } else if (school != null) {
            return "Staff[Person[name=" + name + ", address=" + address + "], school=" + school + ", pay=" + pay + "]";
        } else {
            return "Person[name=" + name + ", address=" + address + "]";
        }
    }
}

}
