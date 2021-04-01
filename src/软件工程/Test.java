package 软件工程;

import java.util.List;
import java.util.Map;

public class Test 
{
  public static int CountEachLineCharacter(String line) 
  {
      return line.length();
  }

  public static int CountWordNum(String line, List<String> lists) 
  {
      int wordcount = 0;
      String[] wordsArr1 = line.split("[^a-zA-Z0-9]");  //过滤   \w=[a-zA-Z0-9_]   返回一个下标从零开始的一维数组

      for (String newword : wordsArr1) 
      {  
          if(newword.length()!= 0) 
          {               	
              if((newword.length() >= 4) && (Character.isLetter(newword.charAt(0))
                  && Character.isLetter(newword.charAt(1)) && Character.isLetter(newword.charAt(2))
                  && Character.isLetter(newword.charAt(3)))) 
              {               		
                  wordcount++;
                  lists.add(newword);  
              }
          }  
      }

      return wordcount;
  }

  public static void CountEachWordNum(Map<String, Integer> wordsCount,List<String> lists) 
  {     
      for (String li : lists)      //for(String s:v) s是遍历后赋值的变量，v是要遍历的list
      {  
          if(wordsCount.get(li) != null) 
          { 
              wordsCount.put(li,wordsCount.get(li) + 1);  
          }
          else 
          {  
              wordsCount.put(li,1);  
          }  

      }  
  }

}