import java.io.*;   
import java.util.Scanner;
public class Longest {   
   
	public static void main(String[] args)throws IOException{    
                System.out.println("Enter a sentence:");  
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
                String s1=br.readLine();  
                String longestWord = "";
                String[] words = s1.split(" ");
                for (int i=0;i<words.length;i++ )
                {
                    if(words[i].length()>longestWord.length())
                    {
                    	longestWord=words[i];
                    }
                }         

        System.out.println("The longest word in the sentence is:"+longestWord); 
        
        } 
        } 
  
  
  
  
  
  
  
  
	  
   
  
