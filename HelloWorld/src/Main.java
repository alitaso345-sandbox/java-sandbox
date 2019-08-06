public class Main {

    public static void main(String[] args) {
        Book comic = new Book(500);
        Book technicalBook = new Book(250);

        Command discountCommand = new DiscountCommand();
        Command specialDiscountCommand = new SpecialDiscountCommand();

        discountCommand.setBook(comic);
        discountCommand.execute();
        System.out.println("割引後価格は、" + comic.getAmount() + "円");

        discountCommand.setBook(technicalBook);
        discountCommand.execute();
        System.out.println("割引後価格は、" + technicalBook.getAmount() + "円");

        specialDiscountCommand.setBook(technicalBook);
        specialDiscountCommand.execute();
        System.out.println("割引後価格は、" + technicalBook.getAmount() + "円");
    }
}
