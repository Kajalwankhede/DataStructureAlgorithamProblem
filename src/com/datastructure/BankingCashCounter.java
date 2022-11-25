package com.datastructure;
import java.util.Scanner;
public class BankingCashCounter {
    static class Queue {
        int data;
        Queue next;
        public Queue(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Queue front = null, rear = null;
    public void enqueue(int key)
    {
        Queue newNode = new Queue(key);

        if (rear == null)
        {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }
    public void dequeue()
    {
        if (front == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            if (front != rear)
            {
                front = front.next;
            }
            else
            {
                front = rear = null;
            }
        }
    }

    public boolean isEmpty()
    {
        return front == null;
    }

    public static void main(String[] args) {
        System.out.println("\n****************** WELCOME TO BANKING CASH COUNTER ******************");
        BankingCashCounter queue = new BankingCashCounter();
        Scanner sc = new Scanner(System.in);
        Double totalAmount = 5000000.00;
        System.out.println("\nEnter Number of People want to Withdraw and Deposit Money: ");
        int numOfPeople = sc.nextInt();
        for (int i = 0; i < numOfPeople; i++)
        {
            queue.enqueue(i);
        }

        while (!queue.isEmpty())
        {
         int choice;
                System.out.println("Enter the Person Choice: \n\n1: Withdraw \n2: Deposit \n3. Check Cash");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter Amount to be withdraw: ");
                        int withdrawAmount = sc.nextInt();
                        System.out.println(" Amount Withdrawn successfully");
                        queue.dequeue();
                        totalAmount =totalAmount- withdrawAmount;
                        System.out.println("Total Amount in Account: " + totalAmount);
                        System.out.println("THANK YOU!!");
                        break;

                    case 2:
                        System.out.println("Enter Amount to be Deposit:");
                        int depositAmount = sc.nextInt();
                        System.out.println("Amount Deposited successfully");
                        queue.dequeue();
                        totalAmount = totalAmount + depositAmount;
                        System.out.println("Total Amount in Account: " + totalAmount);
                        System.out.println("THANK YOU!!");
                        break;
                    case 3:
                        System.out.println("Balance Amount: "+totalAmount);


                    default:
                        System.out.println("Invalid");
                }
            }
        }
    }

