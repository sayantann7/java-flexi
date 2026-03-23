public class TextBook extends LibraryItem {

    public TextBook(String itemId, String title) {
        super(itemId, title);
    }

    @Override
    public void processLoan() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Textbook '" + getTitle() + "' issued...");
        } else {
            System.out.println("Error: '" + getTitle() + "' is already on loan.");
        }
    }
}
