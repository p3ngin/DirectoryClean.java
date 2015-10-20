
package directoryclean;

import java.io.File;
import java.io.IOException;
import static java.time.Clock.system;
import java.util.List;

/**
 *
 * @StephenJuchno
 */
public class DirectoryClean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      System.out.println("Deletetion Started.");
      File currentDir = new File ("C:/Users/User/Documents/Test/");
      DeleteFiles(currentDir);
    }
    public static void DeleteFiles(File folder) throws IOException{
        
        folder = new File ("C:/Users/User/Documents/Test/");
        System.out.println("Starting Deletion");
        
        File[] files = folder.listFiles();
        File File = null;
            for(File file: files){
               if(file.isFile()){
                   file.delete();
               }else if (file.isDirectory()){
                   DeleteFiles(File);
               }
            }
        
          
    }

}
