package employwage;

public class EmpWageBuilderSwitchCaseUC4 {
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int IS_PART_TIME = 2;
    public static final int WORK_DAY_PER_MONTH = 20;

    public static void main(String[] args){
        int empHrs = 0;
        int empWage = 0;
        int partTimeHrs = 0;
        int partTimeEmpWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_FULL_TIME:

                empHrs = 8;
                empWage = empHrs * EMP_RATE_PER_HOUR;
                System.out.println("Emp Wage : " + empWage);
                break;
            case IS_PART_TIME:
                partTimeHrs = 8;
                partTimeEmpWage = partTimeHrs * EMP_RATE_PER_HOUR;
                System.out.println("Part time Emp Wage : " + partTimeEmpWage);
                break;
            default:
                empHrs = 0;
                System.out.println("NO Wage");
        }
    }
}
