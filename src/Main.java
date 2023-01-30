import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Worker worker1 = new Worker("John", 34,  10.00);
        Worker worker2 = new Worker("Joe", 32, 12.00);
        Worker worker3 = new Worker("Jack", 47,  14.00);


        SalaryWorker salaryWorker1 = new SalaryWorker("Timothy", 1,  2000.00);
        SalaryWorker salaryWorker2 = new SalaryWorker("Jason", 2,  2500.00);
        SalaryWorker salaryWorker3 = new SalaryWorker("Tina", 3,  3000.00);


        ArrayList<Worker> workers = new ArrayList<Worker>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(salaryWorker1);
        workers.add(salaryWorker2);
        workers.add(salaryWorker3);

        System.out.println("Weekly Pay Per Worker");
        System.out.println("------------------------------------");
        System.out.println("Name\tWeek 1\tWeek 2\tWeek 3");
        System.out.println("------------------------------------");


        for (Worker w : workers) {
            System.out.println(w.getName() + "\t" + w.calculateWeeklyPay(40) + "\t" + w.calculateWeeklyPay(50) + "\t" + w.calculateWeeklyPay(40));
        }
    }
}




