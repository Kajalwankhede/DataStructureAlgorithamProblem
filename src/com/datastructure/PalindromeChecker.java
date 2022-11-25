package com.datastructure;
import java.util.Scanner;

public class PalindromeChecker {
        static class Queue {
            char data;
            Queue next;

            public Queue(char data)
            {
                this.data = data;
                this.next = null;
            }
        }

        Queue front = null, rear = null;
        public void enqueue(char key)
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

        // Method to remove an key from queue.
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

        public char peek()
        {
            if (!isEmpty())
            {
                return front.data;
            }
            else
            {
                System.out.println("Stack is empty");
                return ' ';
            }
        }
        public boolean isEmpty()
        {
            return front == null;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            PalindromeChecker queue = new PalindromeChecker();
            System.out.println("Enter the string: ");
            String inputString = scan.next().toLowerCase();
            scan.close();


            for (int i = inputString.length()-1; i >= 0; i--) ////Add String to queue
            {
                queue.enqueue(inputString.charAt(i));
            }

            String reverse = "";
            while (!queue.isEmpty()) //dequeue and  back to a string
            {
                reverse = reverse+ queue.peek();
                queue.dequeue();
            }

            if (inputString.equals(reverse))
            {
                System.out.println("The above string : "+inputString+" is palindrome");
            }
            else
            {
                System.out.println("The above string : "+inputString+" is not palindrome");
            }
        }
    }

