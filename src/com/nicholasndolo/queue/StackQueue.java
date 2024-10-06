package com.nicholasndolo.queue;

import java.util.Arrays;
import java.util.Stack;

public class StackQueue {
//    [10, 20, 30, 40]
   private Stack<Integer> stackA = new Stack<>();
   private Stack<Integer> stackB = new Stack<>();

    public void enqueque(int item){
        stackA.push(item);
    }

    public int dequeque(){
        if(stackA.isEmpty() && stackB.isEmpty())
            throw new IllegalStateException();

        if(stackB.isEmpty())
            while(!stackA.isEmpty())
                stackB.push( stackA.pop());

        return stackB.pop();

    }

    @Override
    public String toString(){
        return Arrays.toString(stackA.toArray());
    }
}
