package googlespreadsheetdatainserting;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class GoogleSpreadsheetDataInserting {
    
    public void insertDate() {
        
        Calendar c = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        FileWriter fw = null;
        try {
           File filePath = new File(".\\data.txt"); 
           fw = new FileWriter(filePath);
           fw.write(dateFormat.format(c.getTime()) + System.getProperty("line.separator"));
           
           for(int i = 1; i < 365; i++) {
                c.add(Calendar.DATE, 1);
                fw.write(dateFormat.format(c.getTime()) + System.getProperty("line.separator"));
           }
           
           fw.close();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
   
    public static void main(String[] args) {
        GoogleSpreadsheetDataInserting g = new GoogleSpreadsheetDataInserting();
        g.insertDate();
    }
    
}
