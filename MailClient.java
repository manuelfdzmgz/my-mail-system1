
/**
 *
 */
public class MailClient
{
    //Asociated server with client
    private MailServer server;
    //email user that use the client
    private String user;
    public MailClient(String user,MailServer server)
    {
        this.server = server;
        this.user = user;
        

    }
    public  MailItem getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
    public void printNextMailItem()
    {
        MailItem email = server.getNextMailItem(user);
        if (email == null)
        {
            System.out.println("Dont have an email");
        }
        else
        {
           email.print();         
        }   
    }
    public void sendMailItem(String adressed, String message, String subject)
    {
        MailItem item = new MailItem(user, adressed, message, subject);
        server.post(item);
    }
   
}
