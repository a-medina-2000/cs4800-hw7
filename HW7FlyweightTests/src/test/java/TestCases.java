import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCases {
    DocumentSkeleton testDoc = new Document();

    @Test
    public void testSetFileName() {
        testDoc.setFileName("Test File");
        String expected = "Test File";
        String actual = testDoc.getFileName();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetFontSize() {
        testDoc.setFontSize(12);
        int expected = 12;
        int actual = testDoc.getSize();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetFontColor() {
        testDoc.setFontColor("Blue");
        String expected = "Blue";
        String actual = testDoc.getColor();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetFontType() {
        testDoc.setFontType("Arial");
        String expected = "Arial";
        String actual = testDoc.getFont();
        assertEquals(expected, actual);
    }
}
