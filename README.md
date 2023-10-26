# crazyMarket

This Java program is designed to simulate the operation of a market. The market includes 1 cash register and 2 queues (qServer and qLottery). The rules for customers receiving service and being added to queues are as follows:

- In the qServer queue, if the waiting time of the next customer is greater than or equal to the Wthreshold value, the customer at the front of the queue is served, and the customer is removed from the queue.
- If the waiting time is less than the Wthreshold value, the customer is added to the qLottery queue, and the next customer to be served from this queue is selected with a random number.

## How It Works

The program is defined within the MarketSimulator class. Customer arrival times and service times are calculated using exponential distribution. As simulation time progresses, there can be two different events:

- Customer Arrival: A new customer arrives at the market and is added to the queue.
- Customer Service and Departure: The customer at the front of the queue receives service and leaves the cash register.

## Setup

1. Ensure that Java JDK is installed.
2. Download or clone the project to your computer.
3. Navigate to the project folder and open the terminal.
4. Run the following command:

## Requirements

- Java JDK 8 or higher
- Java IDE (optional)

