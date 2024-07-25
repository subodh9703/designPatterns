package net.media.training.live.srp;

public class UserInterface{
    private Employee employee;
    public UserInterface(Employee employee){
        this.employee=employee;
    }

    public String generateHTML(){
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + employee.getLeaveService().calculateRemainingLeaves() + "</span>";
        str += "<span>" + Math.round(employee.getMonthlySalary() * 12) + "</span>";
        if (employee.getManager() != null) str += "<span>" + employee.getManager() + "</span>";
        else str += "<span>None</span>";
        str += "<span>" + employee.getLeaveService().getTotalLeavesLeftPreviously() + "</span>";
        return str + "</div> </div>";
    }

}
