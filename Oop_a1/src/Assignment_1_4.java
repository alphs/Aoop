import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Assignment_1_4 {

    public class Stack {
        private ArrayList<Integer> elements;
        private int top;

        public Stack(){
            ArrayList<Integer> elements = new ArrayList<>();
            top = -1;
        }

        boolean isEmpty(){
            return top == -1;
        }

        public int size(){
            return top + 1;
        }

        void push(int num){
            ++top;
            elements.add(top, num);
        }

        public void push(int n, ArrayList<Integer> list){
            for (int i = 0; i < n; i++) {
                push(list.get(i));
            }
        }

        int pop(){
            if(isEmpty()) {
                throw new NoSuchElementException("Stack empty");
            }
            --top;
            return this.elements.get(top + 1);
        }

        public ArrayList<Integer> pop(int n){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(pop());
            }
            return list;
        }


    }

    public static void main(String[] cmdLn){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


    }

}