
/**
 *
 */
public class MailClient
{
    //Asociated server with client
    private MailServer server;
    //email user that use the client
    private String user;
    public MailClient(String newUser,MailServer newServer)
    {
        server = newServer;
        user = newUser;
    }
    public String getNextMailItem()
    {
        return server.getNextMailItem(user);
    }
    public void printNextMailItem()
    {
        MailItem= server.getNextMailItem(user);
        if (item == null)
        {
            System.out.println("Dont have an email");
        }
        else
         {
           item.print();         
        }   
    }
    public void sendMailItem(String adressed, String message)
    {
        MailItem item = new MailItem(user, adressed, message);
        server.post(item);
    }
}
