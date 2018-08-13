import java.io.*;  
class Changer{  
  
 public static void main(String args[])throws IOException 
 {  
  InputStreamReader is=new InputStreamReader(System.in);    
  BufferedReader br=new BufferedReader(is);   
 String newstr="";  
 char ch=' ';  
  
 System.out.println("Enter the Word:");  
 String str=br.readLine();  
  for(int i=0;i<str.length();i++){
  if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122)
  newstr+=(char)((int)str.charAt(i)-32);
  else if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90)
  newstr+=(char)((int)str.charAt(i)+32);  
  else
  newstr+=str.charAt(i);
  }
  System.out.println("Edited Word:"+newstr);   
}  
  
}  
