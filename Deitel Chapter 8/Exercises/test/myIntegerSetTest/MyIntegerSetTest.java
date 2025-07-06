package myIntegerSetTest;

import myIntegerSet.MyIntegerSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyIntegerSetTest {
    @Test
    public void testCanInsertElement() {
        MyIntegerSet myIntegerSet = new MyIntegerSet();
        assertFalse(myIntegerSet.contains(5));
        myIntegerSet.insertElement(5);
        assertTrue(myIntegerSet.contains(5));
    }

    @Test
    public void testCanDeleteElement() {
        MyIntegerSet myIntegerSet = new MyIntegerSet();

        assertFalse(myIntegerSet.contains(5));
        myIntegerSet.insertElement(5);
        assertTrue(myIntegerSet.contains(5));

        myIntegerSet.deleteElement(5);
        assertFalse(myIntegerSet.contains(5));
    }

    @Test
    public void testIfTwoEqualElementsAre_returnCorrectStatus() {
        MyIntegerSet myIntegerSet1 = new MyIntegerSet();
        MyIntegerSet myIntegerSet2 = new MyIntegerSet();

        assertTrue(myIntegerSet1.isEqual(myIntegerSet2));

        myIntegerSet1.insertElement(5);
        assertEquals(1, myIntegerSet1.elementsIn());

        assertFalse(myIntegerSet1.isEqual(myIntegerSet2));
    }

    @Test
    public void testUnionOfTwoElements_returnsCorrectSet() {
        MyIntegerSet myIntegerSet1 = new MyIntegerSet();
        MyIntegerSet myIntegerSet2 = new MyIntegerSet();

        myIntegerSet1.insertElement(4);
        myIntegerSet1.insertElement(5);
        myIntegerSet1.insertElement(6);

        myIntegerSet2.insertElement(5);
        myIntegerSet2.insertElement(6);
        myIntegerSet2.insertElement(7);


        MyIntegerSet myIntegerSet3 = new MyIntegerSet();
        boolean[] unionSet = MyIntegerSet.union(myIntegerSet1, myIntegerSet2);

        myIntegerSet3.setStatus(unionSet);
        assertEquals(4, myIntegerSet3.elementsIn());

        assertTrue(myIntegerSet3.contains(4));
        assertTrue(myIntegerSet3.contains(5));
        assertTrue(myIntegerSet3.contains(6));
        assertTrue(myIntegerSet3.contains(7));
    }

    @Test
    public void testIntersectionOfTwoElements_returnsCorrectSet() {
        MyIntegerSet myIntegerSet1 = new MyIntegerSet();
        MyIntegerSet myIntegerSet2 = new MyIntegerSet();

        myIntegerSet1.insertElement(4);
        myIntegerSet1.insertElement(5);
        myIntegerSet1.insertElement(6);

        myIntegerSet2.insertElement(5);
        myIntegerSet2.insertElement(6);
        myIntegerSet2.insertElement(7);


        MyIntegerSet myIntegerSet3 = new MyIntegerSet();
        boolean[] intersectionSet = MyIntegerSet.intersect(myIntegerSet1, myIntegerSet2);

        myIntegerSet3.setStatus(intersectionSet);
        assertEquals(2, myIntegerSet3.elementsIn());

        assertTrue(myIntegerSet3.contains(5));
        assertTrue(myIntegerSet3.contains(6));
    }

    @Test
    public void testStringOutput_ofSet() {
        MyIntegerSet myIntegerSet1 = new MyIntegerSet();
        myIntegerSet1.insertElement(4);
        myIntegerSet1.insertElement(5);
        myIntegerSet1.insertElement(6);

        assertEquals("4 5 6", myIntegerSet1.toString());
    }


}