package org.example;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicatesWithIntegers() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(4);
        input.add(5);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        ArrayList<Integer> result = Main.removeDuplicates(input);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveDuplicatesWithStrings() {
        ArrayList<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("apple");
        input.add("orange");
        input.add("banana");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("banana");
        expected.add("orange");

        ArrayList<String> result =  Main.removeDuplicates(input);
        assertEquals(expected, result);
    }
}
