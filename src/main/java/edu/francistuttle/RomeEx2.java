package edu.francistuttle;

import com.sun.syndication.feed.synd.SyndCategoryImpl;
import com.sun.syndication.feed.synd.SyndContentImpl;
import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndLinkImpl;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import java.io.File;
import java.net.URL;
import java.util.List;

public class RomeEx2 {
    public static void main(String[] args) {
        try {/* ww w . j a va 2 s . c om */
            String urlString = "https://www.nasa.gov/news-release/feed/";
            URL feedUrl = new URL(urlString);

           // File nasaFile = new File("C:/Users/ak1048135/Downloads/Abe's git folder/nasaparser/nasa.xml");

            SyndFeedInput input = new SyndFeedInput();
            //SyndFeed feed = input.build(new XmlReader(nasaFile));
            
            SyndFeed feed = input.build(new XmlReader(feedUrl));

            System.out.println("Feed Title: " + feed.getTitle());
            System.out.println("Link: " + feed.getLink());
            System.out.println("Description: " + feed.getDescription());
            System.out.println("");

            // Get the entry items...
            for (SyndEntry entry : (List<SyndEntry>) feed.getEntries()) {
                System.out.println("Title: " + entry.getTitle());
                //System.out.println("Description: " + entry.getDescription().getValue());
                System.out.println("Link: " + entry.getLink());
                System.out.println("");
                
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
