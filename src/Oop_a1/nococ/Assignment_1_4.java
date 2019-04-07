package Oop_a1.nococ;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Assignment_1_4 {

    public static class Stack {
        private int size;
        private Node top;

        private static class Node{
            private int element;
            private Node next;
        }

        public Stack(){
            top = null;
            size = 0;
        }

        public boolean isEmpty(){
            return top == null;
        }

        public int size(){ return size; }

        public void push(int num){
            Node oldTop = top;
            top = new Node();
            top.element = num;
            top.next = oldTop;
            ++size;
        }

        public void push(int n, ArrayList<Integer> list){
            for (int i = 0; i < n; ++i){
                push(list.get(i));
            }
        }

        public int pop(){
            if(isEmpty()) {
                throw new NoSuchElementException("Stack empty");
            }
            int toReturn = top.element;
            top = top.next;
            --size;
            return toReturn;
        }

        public ArrayList<Integer> pop(int n){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(pop());
            }
            return list;
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Stack stack = new Stack();

        stack.push(3, list);
        System.out.println(stack.pop(3));


    }

}