import java.io.File;
import java.io.IOException;

public class Comments3 {
    //Example How to use Comment
    // Use Comment to explain what the class/method is used for
    // and in which class is it used.
    // Also some thought for maybe adding future features
    class Example_Comment_Explanation{
        // This is a Function that read PDF Files
        // and return the Content as a String
        // but it only read electronic written
        // Document. It fails to read scanned Dokument

        // This Function will be used
        // when OCR Enginge is not needed.
        // Maybe there is an possibility to
        // differant both PDF
        public String readPDF(File documentToRead) {
            String documentContent = "";
            try (PDDocument document = PDDocument.load(documentToRead);) {
                PDFTextStripper stripper = new PDFTextStripper();
                documentContent = stripper.getText(document);
                document.close();
            } catch (IOException ioException) {
                // if file cant be read empty String is returned
            }
            return documentContent;
        }
    }
}
