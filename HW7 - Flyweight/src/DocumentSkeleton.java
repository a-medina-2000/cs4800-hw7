public interface DocumentSkeleton {
    public void setFileName(String fileName);
    public void setFontType(String font);
    public void setFontColor(String color);
    public void setFontSize(int size);
    public void documentDetails();

    public String getFileName();
    public String getFont();
    public String getColor();
    public int getSize();
}
