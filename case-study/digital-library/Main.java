public class Main {
    public static void main(String[] args) {
        TextBook tb1 = new TextBook("B101", "Java Core");
        tb1.processLoan();

        tb1.processLoan();

        ResearchPaper rp1 = new ResearchPaper("R99", "AI Ethics");
        rp1.processLoan();
    }
}
