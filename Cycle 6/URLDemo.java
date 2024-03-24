import java.net.*;
import java.io.*;
import java.util.Date;
public class URLDemo {
    public static void main(String[] args) {
        int i;
        try{
            @SuppressWarnings("deprecation")
            URL u = new URL("https://www.iitk.ac.in/esc101/share/downloads/javanotes5.pdf");
            URLConnection uc= u.openConnection();
            System.out.println("Date : "+new Date(uc.getDate()));
            System.out.println("Content Type : "+uc.getContentType());
            int len=uc.getContentLength();
            if (len>0) {
                try(FileOutputStream fout = new FileOutputStream("Abcd.pdf")){
                InputStream in = uc.getInputStream();
                i=0;
                while ((i=in.read())!=-1 && i<len) {
                    fout.write((char)i);
                }
                in.close();
                System.out.println("File Downloaded");
            }
            catch(Exception e){}
            }
            else{
                System.out.println("Error");
            }
        }
        catch(Exception e){

        }
        finally{
            
        }
    }
    
}
