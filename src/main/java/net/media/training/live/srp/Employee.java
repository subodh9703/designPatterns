package net.media.training.live.srp;


public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;
    private String addressStreet;
    private String addressCity;
    private String addressCountry;
    private LeaveService leaveService;
    private String manager;

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public LeaveService getLeaveService() {
        return leaveService;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getManager() {
        return manager;
    }

    public Employee(int empId, double monthlySalary, String name, String addressStreet, String addressCity, String addressCountry, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.leaveService = new LeaveService(leavesTaken,leavesLeftPreviously);
    }

    public Employee() {
    }

    public String toHtml() {
        return new UserInterface(this).generateHTML();
    }
    //other method related to customer
}
