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
public interface TextFileReaderStrategy {
    public abstract List readFile(String path)throws FileNotFoundException, IOException;
}
