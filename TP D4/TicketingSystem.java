/**
 * The system class contains methods pertaining the basic functions of the ticketing system itself
 * This may evolve into simply being the "Main" class, or we may keep the "Main" class as a separate entity
 * 
 * @Version 1.0 September 25, 2023
 */

public class TicketingSystem {

    public TicketingSystem()
    {
        //Do we need a constructor for this class?
    }

    /**
     * Once the user has confirmed their purchase, the system will make the necessary operations to transfer the required funds from the user's account into the system.
     * This process will only be staged, not actually performed.
     * However, this method will be responsible for calling the confirmation() and update() methods
     * @return boolean indicating whether or not the transaction was successful
     */
    private boolean completeTransaction(String cardNumber)
    {
        if (confirmation())
        {
            //perform the payment operation, then:
            if (update())
            {
                return true;
            }
            return false;
        }
        return false;
    }

    /**
     * Once payment method is input, this method will prompt the user to confirm their purchase before finalizing it.
     * May be merged into another method/class implementation
     * @return boolean to indicate User confirmation
     */
    private boolean confirmation()
    {
        if (true)   //The user confirms their purchase
        {
            return true;
        }
        return false; //The user denies their purchase
    }

    /**
     * Once the transaction has been confirmed successful, the system will update the ticket inventory in the database to reflect the new number of tickets.
     * This method may be broadened in scope to be usable by multiple classes for Database updates. Further testing required.
     * @return boolean indicating whether the update was successful or not
     */
    private boolean update()
    {
        if (true) //complete
        {
            return true;
        }
        else //if not complete
        {
            return false;
        }
    }

    
}
