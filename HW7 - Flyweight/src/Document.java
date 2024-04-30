public class Document implements DocumentSkeleton {
    private String fileName;
    private String font;
    private String color;
    private int size;

    public Document() {
        fileName = "";
        font = "";
        color = "";
        size = 0;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setFontType(String font) {
        this.font = font;
    }
    public void setFontColor(String color) {
        this.color = color;
    }
    public void setFontSize(int size) {
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFont() {
        return font;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void documentDetails() {
        System.out.println("Document Name: " + fileName + " | Font Type: " +
                font + " | Font Color: " + color + " | Font Size: " + size);
    }
}
