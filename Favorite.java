import java.net.URL;
import java.util.Date;

public class Favorite { 
    private Date date; 
    private String name; 
    private URL url; 

    public Favorite(String name, String address) { 
        this.name = name;
        this.url = new URL(adress);
        this.date = new Date();
    }

    @Override
    public String toString() { 
        String s = this.name + " " + this.date + "\n"' 
        return s + url.toString(); 
    }
}