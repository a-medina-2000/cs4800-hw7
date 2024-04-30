//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DocumentSkeleton doc = DocumentFactory.getDocument("doc");

        doc.setFileName("HelloWorldCS5800");
        doc.setFontSize(16);
        doc.setFontColor("Red");
        doc.setFontType("Arial");
        doc.documentDetails();

        doc.setFileName("HelloWorldCS5800");
        doc.setFontSize(12);
        doc.setFontColor("Blue");
        doc.setFontType("Times New Roman");
        doc.documentDetails();

        doc.setFileName("HelloWorldCS5800");
        doc.setFontSize(8);
        doc.setFontColor("Yellow");
        doc.setFontType("comic sans");
        doc.documentDetails();

        doc.setFileName("HelloWorldCS5800");
        doc.setFontSize(22);
        doc.setFontColor("Purple");
        doc.setFontType("Courier New");
        doc.documentDetails();
    }
}