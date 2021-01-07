public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >-1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                return this.tonerLevel += tonerAmount;
            }
        }
        return -1;
    }
    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            pagesToPrint = (pages /2 + pages %2);
            this.pagesPrinted +=pagesToPrint;// the pagesToPrint value is then added to the class field pagesPrinted, so pagePrinted value is returned to the field pagePrinted for the Getter.
            System.out.println("Printing in Duplex Mode...");
        }else{
            pagesToPrint = pages;
            this.pagesPrinted +=pagesToPrint;
        }
        return pagesToPrint;
        }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}


