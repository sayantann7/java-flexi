public abstract class LibraryItem {
    private String itemId;
    private String title;
    protected boolean isReserved;

    public LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
        this.isReserved = false;
    }

    public String getTitle() {
        return title;
    }

    public void showDetails() {
        System.out.println("Item [ID=" + itemId + ", Title=" + title + ", Reserved=" + isReserved + "]");
    }

    public abstract void processLoan();
}
