
public class Worker extends Person {
    private double hourlyPayRate;


    public Worker(String name, int age, double hourlyPayRate) {
        super(name, age);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double totalPay;


        if (hoursWorked <= 40) {
            totalPay = hoursWorked * hourlyPayRate;
        }

        else {
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * (hourlyPayRate * 1.5);
            double regularPay = 40 * hourlyPayRate;
            totalPay = overtimePay + regularPay;
        }
        return totalPay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double totalPay = 0.0;
        double regularHours = 0.0;
        double overtimeHours = 0.0;
        double regularPay = 0.0;
        double overtimePay = 0.0;


        if (hoursWorked <= 40) {
            totalPay = hoursWorked * hourlyPayRate;
            regularHours = hoursWorked;
            overtimeHours = 0;
            regularPay = totalPay;
            overtimePay = 0;
        }

        else {
            overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * (hourlyPayRate * 1.5);
            regularPay = 40 * hourlyPayRate;
            totalPay = overtimePay + regularPay;
            regularHours = 40;
            regularPay = regularHours * hourlyPayRate;
            overtimePay = overtimeHours * (hourlyPayRate * 1.5);
        }

        return "Regular Hours: " + regularHours + " hours, Regular Pay: $" + regularPay
                + "\nOvertime Hours: " + overtimeHours + " hours, Overtime Pay: $" + overtimePay
                + "\nTotal Pay: $" + totalPay;
    }

    public String getName() {
        return "Worker";
    }
}

