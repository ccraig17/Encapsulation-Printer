# Encapsulation-Printer
The Use of Encapsulation via a Printer:

        Printer printer = new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagePrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagePrinted +" new total print count for printer = " +printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    

