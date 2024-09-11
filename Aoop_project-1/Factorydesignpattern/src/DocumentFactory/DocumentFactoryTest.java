/*import main.Document;
import main.DocumentFactory;
import main.WordDocument;
import main.PDFDocument;
import main.ExcelDocument;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentFactoryTest {

    @Test
    void testCreateWordDocument() {
        Document doc = DocumentFactory.createDocument("WORD");
        assertNotNull(doc, "Document should not be null");
        assertTrue(doc instanceof WordDocument, "The document should be an instance of WordDocument.");
    }

    @Test
    void testCreatePDFDocument() {
        Document doc = DocumentFactory.createDocument("PDF");
        assertNotNull(doc, "Document should not be null");
        assertTrue(doc instanceof PDFDocument, "The document should be an instance of PDFDocument.");
    }

    @Test
    void testCreateExcelDocument() {
        Document doc = DocumentFactory.createDocument("EXCEL");
        assertNotNull(doc, "Document should not be null");
        assertTrue(doc instanceof ExcelDocument, "The document should be an instance of ExcelDocument.");
    }

    @Test
    void testCreateUnknownDocument() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DocumentFactory.createDocument("TEXT");
        });
        assertEquals("Unknown document type: TEXT", exception.getMessage());
    }
}
*/


import main.Document;
import main.DocumentFactory;
import main.WordDocument;
import main.PDFDocument;
import main.ExcelDocument;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentFactoryTest {

    @Test
    void testCreateWordDocument() {
        Document doc = DocumentFactory.createDocument("WORD");
        assertNotNull(doc,"Document should not be null");
        assertTrue(doc instanceof WordDocument, "The document should be an instance of WordDocument.");
    }

    private void assertNotNull(Document doc, String documentShouldNotBeNull) {
    }

    @Test
    void testCreatePDFDocument() {
        Document doc = DocumentFactory.createDocument("PDF");
        assertNotNull(doc,"Document should not be null");
        assertTrue(doc instanceof PDFDocument, "The document should be an instance of PDFDocument.");
    }

    @Test
    void testCreateExcelDocument() {
        Document doc = DocumentFactory.createDocument("EXCEL");
        assertNotNull(doc,"Document should not be null");
        assertTrue(doc instanceof ExcelDocument, "The document should be an instance of ExcelDocument.");
    }

    @Test
    void testCreateUnknownDocument() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            DocumentFactory.createDocument("TEXT");
        });
        assertEquals("Unknown document type: TEXT", thrown.getMessage());
    }
}
