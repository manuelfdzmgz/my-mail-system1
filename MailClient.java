
/**
 *
 */
public class MailClient
{
    //Asociated server with client
    private MailServer server;
    //email user that use the client
    private String user;
    private MailItem lastEmail;
    public MailClient(String user,MailServer server)
    {
        this.server = server;
        this.user = user;
        
        

    }

    public  MailItem getNextMailItem()
    {
        lastEmail = server.getNextMailItem(user);
        return server.getNextMailItem(user);
    }

    public void printNextMailItem()
    {
        lastEmail = server.getNextMailItem(user);
        if (lastEmail == null)
        {
            System.out.println("Dont have an email");
        }
        else
        {
            lastEmail.print();         
        }   
    }

    public void sendMailItem(String adressed, String message, String subject)
    {
        
        MailItem  item= new MailItem (user, adressed, message, subject);
        server.post(item);
    }

    public void getNextMailItemAndAutorespond()
    {  
        MailItem email = server.getNextMailItem(user);
        if(email !=  null)
        {
            String subject =  "RE: " + email.getSubject();
            String message = "Estoy de vacaciones " +"\nº " + email.getMessage();
            String newTo = email.getFrom();
            MailItem autorespond = new MailItem(user, newTo, subject, message);
            server.post(autorespond);
        }

    }

    /**
     * Metodo que imprime por pantalla los mensajes que tiene el usuario que esta utilizando el cliente
     */
    public void sloopMail()
    {
        int numberOfMails = server.howManyMailItems(user);
        System.out.println("numero de emails en el servidor:" +numberOfMails);
    }

    /**
     * 
     */
    public void printLastMailItem()
    {      
        if(lastEmail != null)
        {
            lastEmail.print();        
        }
        else
        { 
            System.out.println("THERE IS NO EMAILS");
        }
    }
}

