public class Printer {
    private int tonerLevel;
    private boolean duplex;
    private int pagesPrinted;


//    public Printer(int tonerLevel, int pagesPrinted) {
//        this.tonerLevel = tonerLevel;
//        this.pagesPrinted = pagesPrinted;
//        this.duplex = false;
//    }

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <=100)?tonerLevel:-1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }


//    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
//        this.tonerLevel = (tonerLevel<0 || tonerLevel>100)?-1:tonerLevel;
//        this.pagesPrinted = pagesPrinted;
//        this.duplex = duplex;
//    }

    public int addToner(int tonerAmount)
    {
        int temp = tonerLevel+tonerAmount;
        if(temp>100 || temp<0) return -1;
        tonerLevel+=tonerAmount;
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int pages)
    {
        int t = (duplex) ? pages/2 + pages%2 : pages;
        pagesPrinted+=t;
        return t;
    }
}
