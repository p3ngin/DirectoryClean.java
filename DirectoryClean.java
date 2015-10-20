
package directoryclean;

import java.io.File;
import java.io.IOException;

/**
 *
 * @StephenJuchno
 */
public class DirectoryClean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Cleanse Started.");
      
      File currentDir = new File ("C:\\Users\\User\\Documents\\Test");
      DeleteFiles(currentDir);
      
    }
    public static void DeleteFiles(File dir) {
       
        System.out.println("Starting Deletion");
        
        try {
            File[] files = dir.listFiles();
            for(File file : files) {
                if (file.isDirectory()) {
                    System.out.println("directory:" + file.getCanonicalPath());
                    DeleteFiles(file);
                } else {
                    System.out.println("    file:" + file.getCanonicalPath());
                    file.delete();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
          
    }

}
