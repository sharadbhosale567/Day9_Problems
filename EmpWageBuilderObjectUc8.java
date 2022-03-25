package employwagebuilder;

class EmpWageBuilderObject1 {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR =20;
    public static final int WORK_DAY_PER_MONTH = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int empWage = 0;
    public static final int totalEmpWage =0;
    public static final int WORKING_HORS_IN_MONTH = 100;


    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    public EmpWageBuilderObject1(String company, int empRatePerHour, int numOfWorkingDays,
                                 int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;

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
            empWage = empHrs * empRatePerHour;
            totalEmpWage += empWage;
            System.out.println("Emp Wage : " +empWage);
        }
        System.out.println("Total Emp Wage for company : " +company + " is "  + totalEmpWage);
        return;
    }

    public static void main(String[] args) {

        EmpWageBuilderObject1 object1 = new EmpWageBuilderObject1("CCM" ,20,
                2,10);
        EmpWageBuilderObject1 object2 = new EmpWageBuilderObject1("dMart" ,30,
                5,8);
    }
}
