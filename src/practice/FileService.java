/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author trogers8
 */
public class FileService {
    private TextFileReaderStrategy reader;

    public FileService() {
    }

    
    public FileService(TextFileReaderStrategy reader){
        this.reader = reader;
      
        
    }
    
    public List getData(String filePath) throws FileNotFoundException, IOException {
        return reader.readFile(filePath);
    }

    
    
    public TextFileReaderStrategy getReader() {
        return reader;
    }

    public void setReader(TextFileReaderStrategy reader) {
        this.reader = reader;
    }
    
    
}
