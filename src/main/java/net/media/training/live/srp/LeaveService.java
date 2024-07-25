package net.media.training.live.srp;

public class LeaveService {
    private int leavesTaken;
    private int[] leavesLeftPreviously;
    private int totalLeaveAllowed;
    private int leaveTaken;
    private int yearsInOrg;

    LeaveService(int leavesTaken, int[] leavesLeftPreviously){
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg=leavesLeftPreviously.length;
    }
    public int calculateRemainingLeaves(){
        return (this.totalLeaveAllowed - this.leaveTaken);
    }
    public int getTotalLeavesLeftPreviously(){
        int years = 3;
        if (yearsInOrg < 3) {
            years = yearsInOrg;
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously;
    }
}
