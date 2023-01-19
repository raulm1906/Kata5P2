package kata5p2.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata5p2.model.Mail;

/**
 *
 * @author Raúl Marrero Marichal
 */


public class MailListReader {

    public static List<Mail> read;


    public static List<Mail> read(String filename)
    {
        ArrayList<Mail> mails = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String current;

            while((current = br.readLine()) != null)
            {
                if(current.contains("@"))
                    mails.add(new Mail(current));
            }

        } 
        catch(FileNotFoundException e) {}
        catch(IOException e) {}

        return mails; 
    }
}