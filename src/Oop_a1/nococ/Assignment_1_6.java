package Oop_a1.nococ;

import Oop_a1.Dependency.Message;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class Assignment_1_6 {

    /**
     * <b>Invariant:</b> # of messages = size, stack.isEmpty()=(stack.size()==0), size >= 0, top == null stack is empty;
     *
     */
    public static class MessageStack {

        private int size;
        private Node top;

        private static class Node{
            private Message message;
            private Node next;
        }

        public MessageStack(){
            top = null;
            size = 0;
        }

        /**
         * <b> Precondition: </b> a MessageStack is required.
         * <br><b> Postondition: </b> result is a boolean
         * @return true if empty, false if >= 1 message.
         */
        public boolean isEmpty(){
            return top == null;
        }

        /**
         * <b> Precondition: </b> a MessageStack is required.
         * <br><b> Postondition: </b> result will be an integer >= 0.
         * @return returns the number of messages in the MessageStack.
         */
        public int size(){ return size; }

        /**
         * <b> Precondition: </b> a MessageStack is required,
         *               text need to be of type Message.
         * <br><b> Postondition: </b> size of the MessageStack will increase by 1,
         *                pushed message will be the latest to recover.
         * @param text Message to be stored.
         */
        public void push(Message text){
            Node oldTop = top;
            top = new Node();
            top.message = text;
            top.next = oldTop;
            ++size;
        }

        /**
         * <b> Precondition: </b> a MessageStack is required, n >= 0, n needs to be a integer
         *               list needs to not equal null and be of type Message.
         * <br><b> Postondition: </b> MessageStack will increase by n,
         *                last message of list will be first message in the MessageStack.
         * @param n messages to be pushed from list
         * @param list containing messages
         */
        public void push(int n, ArrayList<Message> list){
            for (int i = 0; i < n; ++i){
                push(list.get(i));
            }
        }

        /**
         * <b> Precondition: </b> a MessageStack is required.
         * <br><b> Postondition: </b> number of messages in the stack will decrease by 1,
         *                if MessageStack.isEmpty() is true NoSuchElementException will be thrown,
         *                otherwise the latest message will be returned.
         * @return returns latest message added.
         */
        public Message pop(){
            if(isEmpty()) {
                throw new NoSuchElementException("MessageStack empty");
            }
            Message toReturn = top.message;
            top = top.next;
            --size;
            return toReturn;
        }

        /**
         * <b> Precondition: </b> a MessageStack is required, n needs to be a positive integer.
         * <br><b> Postondition: </b> Will return list containing n latest messages from the MessageStack,
         *                the MessageStack will decrease n in size
         * @param n n messages to be retrieved and removed.
         * @return returns a list containing n messages.
         */
        public ArrayList<Message> pop(int n){
            ArrayList<Message> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(pop());
            }
            return list;
        }
    }

    public static void main(String[] args){

    }

}

