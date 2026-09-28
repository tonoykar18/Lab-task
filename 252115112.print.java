public class print {
    String documentName;
    double costperpage;

    double calculateCost(int page) {
        return page * costperpage;
    }

    double calculateCost(int pages, boolean colorprint) {
        if (colorprint) {
            return pages * costperpage * 2.5;
        }
        return pages;
    }

    public static void main(String[] args) {
        print P = new print();
        P.documentName = "Story Book";
        P.costperpage = 2.00;

        System.out.println(P.calculateCost(10));
        System.out.println(P.calculateCost(10, true));
    }
}
