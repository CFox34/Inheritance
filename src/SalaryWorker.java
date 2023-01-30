public class SalaryWorker extends Worker{
    private double annualSalary;

    public SalaryWorker(String name, int idNumber, double annualSalary){
        super(name,idNumber,annualSalary);
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked){
        double weeklyPay = annualSalary*52;
        return weeklyPay;
    }

    public void displayWeeklyPay(){
        double weeklyPay = calculateWeeklyPay(0);
        System.out.println("This is a fraction of the yearly salary: "+weeklyPay);
    }
}

