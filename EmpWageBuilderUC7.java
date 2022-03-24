package employwage;

public class EmpWageBuilderUC7 {

    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int IS_PART_TIME = 2;
    public static final int WORK_DAY_PER_MONTH = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int empWage = 0;
    public static final int totalEmpWage =0;
    public static final int WORKING_HORS_IN_MONTH = 100;

    public static int calcEmplWageForCompany(String company, int empRate,
                                             int numOfDays, int maxHrs) {
        int empHrs = 0;
        int empWage = 0;
        int partTimeHrs = 0;
        int partTimeEmpWage = 0;
        int totalEmpWage =0;

        for (int day=0; day<= WORK_DAY_PER_MONTH; day++ ) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    partTimeHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * empRate;
            totalEmpWage += empWage;
            System.out.println("Emp Wage : " +empWage);
        }
        System.out.println("Total Emp Wage for company : " +company + " is "  + totalEmpWage);
        return totalEmpWage;

//        int Total_emp_wage_per_Hrs = ( 100 * 20 );
//        System.out.println("WORKING_HORS_IN_MONTH  : " +Total_emp_wage_per_Hrs);
//
    }
    public static void main(String[] args) {
       calcEmplWageForCompany("CCM" ,20, 2,10);
        calcEmplWageForCompany("Airtel" ,30, 2,8);
    }
}
