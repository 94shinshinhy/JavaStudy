package kr.co.bitcamp.polymorphism05;

public class ConversionBook extends Book {
    
    private String language;

    public ConversionBook(int productID, String description, String maker, int price, int iSBN, String title,
            String author, String language) {
        super(productID, description, maker, price, iSBN, title, author);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("언어 >> " + this.getLanguage());
    }
    
}
