package com.nicholasndolo.queue;

public class Main {
    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.enqueque(10);
        queue.enqueque(20);
        queue.enqueque(30);
        var front = queue.dequeque();


        System.out.println(front);
    }
}
