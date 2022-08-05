/**Melisa ATES
 * 20120205045
 * atesmel12@gmail.com
 */
import java.util.*;

public class CrazyMarket2021 {
    /**
     * parameters for simulations
     */
    double lambda;
    /**
     * arrival rate
     */
    double mu;
    /** service rate */

    /**
     * number of customers to be served. (simulation is done after Nth customer
     * served)
     */
    double N;
    static int Wthreshold = 5;
    boolean isFullCheckout;

    public CrazyMarket2021(double lambda, double mu, int n) {
        // TODO: assign lambda mu, etc
        this.lambda = lambda;
        this.mu = mu;
        this.N = (double) n;
    }

    QServer qServer = new QServer();

    QLottery qLottery = new QLottery();

    Customer customerNext = new Customer();
    Customer customerLast = new Customer();
    Customer customerX = new Customer();

    /* variables for statistics */
    double meanWaitingTime = 0; // mean waiting time of SERVED customers
    double totalWaitingTime = 0; // total waiting time of SERVED customers
    double meanServiceTime = 0; // mean service time of SERVED customers
    double totalServiceTime = 0; // total service time of SERVED customers


    public double WaitingTimeHesap() {

        meanWaitingTime = totalWaitingTime / this.N;
        meanServiceTime = totalServiceTime / this.N;
        Random random = new Random();
        double u = random.nextDouble();

        double interArrivalTime = -Math.log(u) / (Double.parseDouble(Double.toString(lambda)));

        customerNext.arrivalTime = customerLast.arrivalTime + interArrivalTime;


        customerNext.serviceTime = -Math.log(u) / (Double.parseDouble(Double.toString(mu)));

        customerNext.waitingTime = customerX.serviceTime - customerNext.arrivalTime;

        return customerX.waitingTime;
    }


    public void simulateMarket() {
        while (N > 0) {
            if (isFullCheckout==false) {    //arrival event
                if (qServer.peek().waitingTime >= Wthreshold) {
                    qServer.dequeue();
                } else {
                    qLottery.add(qServer.dequeue());
                    qLottery.subtract();
                }
                System.out.println("arrival event");
            } else {
                // departure event
                System.out.println("departure event");
            }
        }

    }

    public void printStatistics() {
        System.out.println("totalWaitingTime:" + totalWaitingTime);
        System.out.println("meanWaitingTime:" + meanWaitingTime);
        System.out.println("totalServiceTime:" + totalServiceTime);
        System.out.println("meanServiceTime:" + meanServiceTime);
    }

    public static void main(String[] args) {
        double lambda = Double.parseDouble(args[0]);
        double mu = Double.parseDouble(args[1]);
        int N = 1000;
        CrazyMarket2021 cm = new CrazyMarket2021(lambda, mu, N);
        cm.simulateMarket();
        cm.printStatistics();

    }

}
