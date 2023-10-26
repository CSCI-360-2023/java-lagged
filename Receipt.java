public class Receipt
{
    private String purchaseDate;
    private int totalCost;
    private String purchasedBy;
    private String[] ticketsPurchased;
    private Event event;

    public Receipt(String purchaseDate, int totalCost, String buyerName, Event event, String[] ticketsPurchased)
    {
        this.purchaseDate = purchaseDate;
        this.totalCost = totalCost;
        this.buyerName = purchasedBy;
        this.event = event;
        this.ticketsPurchased =  Array.copyOf(ticketsPurchased, ticketsPurchased.length);
    }

    public void printReceipt()
    {
        System.out.println(this.ticketsPurchased.length + " tickets purchased for " + this.event.getName() + " by " + this.buyerName);
        for (String ticket: this.ticketsPurchased)
        {
            System.out.println(ticket);
        }
        System.out.println("Total cost of purchase: " + this.totalCost);
        System.out.println("Purchased on " + this.purchaseDate);
    }
}