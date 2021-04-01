package Èí¼þ¹¤³Ì;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

 
public class WordCount 
{  
    public static void main(String[] args) 
    {  
        try 
        {
            String inputfile = args[0];
    
            BufferedReader br = new BufferedReader(new FileReader(inputfile));  
            int characterscount=0;
            int wordline = 0;
            int wordcount = 0;
            List<String> lists = new ArrayList<String>();  
            String readLine = null;
            while((readLine = br.readLine()) != null) 
            {  
                wordline++;
                readLine = readLine.toLowerCase();
                characterscount = Test.CountEachLineCharacter(readLine)+1;
                wordcount = Test.CountWordNum(readLine, lists)+1;
            }           
            br.close();  
                
            Map<String, Integer> wordsCount = new TreeMap<String,Integer>(); 
            Test.CountEachWordNum(wordsCount, lists);
                
            Print p = new Print(args[1]);
            p.SortMap(wordsCount,wordline,wordcount,characterscount+wordline);  
        }
        catch(ArrayIndexOutOfBoundsException ee) 
        {
            System.out.println("Error");
        }
        catch(FileSystemAlreadyExistsException f) 
        {
            System.out.println("Not find this file");
        }
        catch(Exception e) 
        {
            System.out.println(e);
        }
    } 
}  