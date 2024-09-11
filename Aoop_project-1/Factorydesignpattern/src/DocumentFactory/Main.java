public class Main {
    public static void main(String[] args) {
        Document wordDoc = DocumentFactory.createDocument ("WORD");
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();
        
        System.out.println();

        Document pdfDoc = DocumentFactory.createDocument("PDF");
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();
        
        System.out.println();

        Document excelDoc = DocumentFactory.createDocument("EXCEL");
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
    }

}
