
/**
 * Write a description of class MailItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    private String from;
    private String to;
    private String message;
    private String subject;
    /**
     * Constructor of main Class MailItem  create objets of MailItem inicializing his atributes  into a parameter
     */
    public MailItem(String from, String to, String message, String subject)
    {
        this.from = from ;
        this.to = to;
        this.message = message;
        this.subject=subject;
    }
    public String getClient1()
    {
        return from;
    }
     public String getClient2()
    {
        return to;
    }
     public String getMessage()
    {
        return message;
    }
    public String getTo()
    {
        return to;
    }
    public void print()
    {
        System.out.println("FROM"+"####"+ from);
        System.out.println("TO"+"####"+ to);
        System.out.println("subject"+"####"+ subject);
        System.out.println("MESSAGE"+"####"+ message);
        
    }
    
}
