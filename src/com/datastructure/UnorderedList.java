package com.datastructure;

public class UnorderedList {
    static class Node{
        String data;
        Node next;

        public Node(String string){
            this.data = string;
            this.next = null;
        }
    }
    Node head = null;
    void add(String string){
        Node node = new Node(string);
        if(head == null){
            this.head = node;
        }else{
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = node;
        }
    }
    boolean findNode(String string){
        Node tmp = head;
        while(tmp != null){
            if(tmp.data == string){
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }
    void getDisplay(){
        Node current = head;
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        while (current!= null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println("\b");
    }

    public static void main(String[] args) {
        UnorderedList list = new UnorderedList();

        list.add("Welcome");
        list.add("To");
        list.getDisplay();

        String []stringArray = {"The", "JavaProgram"};
        for(int i =0; i< stringArray.length;i++){
            if(list.findNode(stringArray[i])){
                continue;
            }
            else{
                list.add(stringArray[i]);
            }
            System.out.println("Added Nodes are: ");
            list.getDisplay();
        }
    }
}

