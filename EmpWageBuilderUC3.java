package employwage;

public class EmpWageBuilderUC3 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        int IS_PART_TIME = 2;
        int partTimeHrs = 0;
        int partTimeEmpWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if( empCheck == IS_FULL_TIME ) {
            empHrs = 8;
            empWage = empHrs * EMP_RATE_PER_HOUR ;
            System.out.println("Emp Wage : " + empWage);
        }
        else if ( empCheck == IS_PART_TIME ) {
            partTimeHrs = 8;
            partTimeEmpWage = partTimeHrs * EMP_RATE_PER_HOUR;
            System.out.println("Part time Emp Wage : " + partTimeEmpWage);
        }
        else if ((empCheck == IS_FULL_TIME) && ( empCheck == IS_PART_TIME)) {
            int Total = 0;
            Total = empWage + partTimeEmpWage;
            System.out.println("Total employee wage : " + Total);
        }
        else {
            System.out.println("No wage");
        }

    }
}
