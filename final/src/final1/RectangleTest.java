package final1;

import static org.junit.Assert.*;

import org.junit.Test;

/*
**********************************************************
Unfortunately, this class is not completed yet ,
we'll work on it ,and we hope you slow us down util the discussion ..
**********************************************************
*/

public class RectangleTest {

	@Test
    void testIntersections() {
        // Arrange
        Rectangle rectangle1 = new Rectangle("rectangle1", 0, 0, 10, 10);
        Rectangle rectangle2 = new Rectangle("rectangle2", 5, 5, 10, 10);
        Rectangle rectangle3 = new Rectangle("rectangle3", 15, 15, 10, 10);

        rectangle1.insert();
        rectangle2.insert();
        rectangle3.insert();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        // Act
        rectangle1.intersections();

        // Assert
        String expectedOutput = "Intersection pairs:\n" +
                "rectangle1 | rectangle2\n" +
                "rectangle2 | rectangle1\n";
        String actualOutput = outputStream.toString();
        assertEquals(expectedOutput, actualOutput);
    }
	@Test
	public void testInsert() {
	    skiplist<String, Integer> skipList = new skiplist<String, Integer>();
	    skipList.insert("apple", 5);
	    skipList.insert("banana", 3);
	    skipList.insert("cherry", 7);
	    skipList.insert("date", 2);
	    assertEquals(4, skipList.size());

	    SkipNode<String, Integer> node1 = skipList.get("apple");
	    assertEquals("apple", node1.getKey());
	    assertEquals(5, node1.getValue().intValue());

	    SkipNode<String, Integer> node2 = skipList.get("banana");
	    assertEquals("banana", node2.getKey());
	    assertEquals(3, node2.getValue().intValue());

	    SkipNode<String, Integer> node3 = skipList.get("cherry");
	    assertEquals("cherry", node3.getKey());
	    assertEquals(7, node3.getValue().intValue());

	    SkipNode<String, Integer> node4 = skipList.get("date");
	    assertEquals("date", node4.getKey());
	    assertEquals(2, node4.getValue().intValue());
	}
	@Test
	public void testRemove() {
	    skiplist<String, Integer> skipList = new skiplist<String, Integer>();
	    skipList.insert("A", 1);
	    skipList.insert("B", 2);
	    skipList.insert("C", 3);
	    skipList.insert("D", 4);

	    SkipNode<String, Integer> removedNode = skipList.remove("C");
	    assertEquals(removedNode.getValue().intValue(), 3);
	    assertEquals(skipList.getSize(), 3);

	    removedNode = skipList.remove("A");
	    assertEquals(removedNode.getValue().intValue(), 1);
	    assertEquals(skipList.getSize(), 2);

	    removedNode = skipList.remove("F");
	    assertNull(removedNode);
	    assertEquals(skipList.getSize(), 2);
	}
	@Test
	public void testFind() {
	    SkipList<String, Integer> skipList = new SkipList<>();
	    skipList.insert("apple", 1);
	    skipList.insert("banana", 2);
	    skipList.insert("cherry", 3);

	    // Test finding an existing element
	    SkipNode<String, Integer> foundNode = skipList.find("banana");
	    assertNotNull(foundNode);
	    assertEquals("banana", foundNode.getKey());
	    assertEquals(2, foundNode.getValue().intValue());

	    // Test finding a non-existing element
	    foundNode = skipList.find("grape");
	    assertNull(foundNode);
	}
	SkipList<String, Integer> skipList = new SkipList<>();
	skipList.insert("key1", 1);
	skipList.insert("key2", 2);
	skipList.insert("key3", 3);
	skipList.dump(); // expected output: "SkipList dump:\nNode has depth 0, Value (null)\nNode has depth 2, Value key1=1\nNode has depth 1, Value key2=2\nNode has depth 1, Value key3=3\nSkipList size is: 3\n"

}
