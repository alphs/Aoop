package Oop_a1.test;

import Oop_a1.nococ.Assignment_1_4;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class AssignmentTest_1_4 {
    private Assignment_1_4.Stack stack;
    private ArrayList<Integer> list;


    @Before
    public void setUp(){
        stack = new Assignment_1_4.Stack();

        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

    }

    @Test
    public void isEmptyTestShouldReturnTrueWhenCheckingNewStack() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void isEmptyShouldReturnFalseWhenObjIsAdded() {
        stack.push(1);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.pop());
    }

    @Test
    public void pushNobjShouldReturnNsize() {
        stack.push(3, list);
        assertEquals(3, stack.size());
    }

    @Test
    public void popNobjShouldReturnListWithNobjAdded(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        ArrayList<Integer> shouldBe = new ArrayList<>();
        ArrayList<Integer> results = stack.pop(3);
        shouldBe.add(4);
        shouldBe.add(3);
        shouldBe.add(2);
        assertEquals(shouldBe, results);
    }

    @Test(expected = NoSuchElementException.class)
    public void popToEmptyStackShouldThrowException() {
        stack.pop();
    }


}
