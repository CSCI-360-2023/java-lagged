/**
 * The User class contains all information and methods relating to Users, such as account payment information
 * 
 * @Version 1.0 September 25, 2023
 */

public class User
{
    //Private variables storing basic user information. Subject to additions and further alterations.
    //All of this information will only be held temporarily in the system until this information can be securely stored in the database.
    private String username;
    private String password;
    private String cardNumber; //May be changed to int depending on how we read and store card numbers

    /**
     * User Constructor Object
     * @param userName stores account username
     * @param password stores account password
     * @param cardNumber stores the user's credit card number (further information would be needed, but we are only mimicking payment)
     */
    public User(String username, String password, String cardNumber)
    {
        this.username = username;
        this.password = password;
        this.cardNumber = cardNumber;
    }

    /**
     * Default User Constructor Object
     */
    public User()
    {
        this.username = "";
        this.password = "";
        this.cardNumber = "";
    }

    //The following are a series of simple Getters/Setters for each of our private variables
    public String getUserName()
    {
        return this.username;
    }

    private void setUserName(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return this.password;
    }

    private void setPassword()
    {
        this.password = password;
    }

    public String getCardNumber()
    {
        return this.cardNumber;
    }

    private void setCardNumber()
    {
        this.cardNumber = cardNumber;
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
     * Once the user has confirmed their purchase, the system will make the necessary operations to transfer the required funds from the user's account into the system.
     * This process will only be staged, not actually performed.
     * @return boolean indicating whether or not the transaction was successful
     */
    private boolean completeTransaction()
    {
        //Will complete the transaction (whatever that looks like)
        if (true) //complete
        {
            return true;
        }
        else //if failed to complete
        {
            return false; 
        }
    }

    /**
     * If the user has indicated that they would like to purchase a ticket (by pressing the "purchase ticket" button in the UI) they will be prompted for their credit card information.
     * The user will have the option of inputting a card manually, or using one that they registered with their account.
     * @return a card number, either one manually entered, or one already in the system.
     */
    private String payment()
    {
        if (true) //User manually enters card info
        {
            return "User Card Number";
        }
        return this.cardNumber; //User uses card info already stored in account
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

    //More methods likely to come in future iterations...
}