import java.util.Arrays;
public class TestReceipt {
public static void main (String args[]) {
    int testCases = 0;
    int testsPassed = 0;
    
    Receipt receipt = new Receipt();

    testCases++;
    if (receipt == null) {
        System.out.println(false);
    }
    else{
        testsPassed++;
        System.out.println(true);
    }

    receipt.setPurchaseDate("asdf");

    testCases++;
    if (receipt.getPurchaseDate().length() > 0)
    {
        testsPassed++;
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }

    testCases++;
    if (receipt.getPurchaseDate().equals("asdf"))
    {
        testsPassed++;
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }

    testCases++;
    receipt.setTotalCost(42);
    if(receipt.getTotalCost() > 0)
    {
        testsPassed++;
        System.out.println(true);
    }
    else
    {
        System.out.println(false);
    }

    testCases++;
    if (receipt.getTotalCost() == 42)
    {
        testsPassed++;
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }

    testCases++;
    receipt.setBuyerName("12345");
    if (receipt.getBuyerName().length() > 0)
    {
        testsPassed++;
        System.out.println(true);
    }
    else
    {   
        System.out.println(false);
    }

    testCases++;
    if (receipt.getBuyerName().equals("12345"))
    {
        testsPassed++;
        System.out.println(true);
    }
    else
    {
        System.out.println(false);
    }

    Event event = new Event("In Love and Warcraft");
    testCases++;    
    receipt.setEvent(event);
    if (receipt.getEvent().getEventName().length() > 0)
    {
        testsPassed++;
        System.out.println(true);
    }
    else
    {   
        System.out.println(false);
    }

    testCases++;
    String[] ticketsPurchased = {"one", "two", "three"};
    receipt.setTicketsPurchased(ticketsPurchased);
    if (receipt.getTicketsPurchased().length > 0)
    {
        testsPassed++;
        System.out.println(true);
    }
    else
    {   
        System.out.println(false);
    }

    testCases++;
    if (Arrays.equals(receipt.getTicketsPurchased(), ticketsPurchased))
    {
        testsPassed++;
        System.out.println(true);
    }
    else
    {
        System.out.println(false);
    }
    System.out.println("\nTest Cases: " + testCases);
    System.out.println("\nTestCasesPassed: " + testsPassed);

    System.out.println();
    receipt.printReceipt();
}

}