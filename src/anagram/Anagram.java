package anagram;
import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
public class Anagram {
public static void main(String args[]) throws FileNotFoundException, IOException {
        LinkedList[] d = new LinkedList[2000];
try {
            final long st=System.nanoTime();
            FileInputStream fstream = new FileInputStream("sahil.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
          for (int u = 0; u < 2000; u++)
          {
              
                d[u] = new LinkedList();
                
            }
          
while ((strLine = br.readLine()) != null ) {
                 d[(ascii(strLine)) % 2000].add(strLine);
            }final long et=System.nanoTime();
            System.out.println(et-st);
         } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the word");
        String e = br.readLine();
        System.out.println("Anagrams of given word are ");
        final long starTime = System.nanoTime();
      for (int fs = 0; fs < d[(ascii(e)) % 2000].size(); fs++) {
            String jk = "" + d[(ascii(e)) % 2000].get(fs);
            if(e.length()==jk.length())
            {
            if (anagram(e, jk)) {
                System.out.println(jk);
            }}}
        final long enTime = System.nanoTime();
        System.out.println((enTime - starTime));
}
//creating hash function
public static int ascii(String str)
    {
 int s=0;char[] e=sort(str);
  for ( int i = 0; i < str.length(); ++i ){
 s=s+(((int) e[i])-95)*((((int) e[i])-96))+(i+1);
  }
  return s;
    }
//checks whether anagram or not
public static boolean anagram(String str1,String str2)
    {
  char[] s=sort(str1);
  char[] l=sort(str2);
  boolean a;
  if(str1.length()==str2.length())
  {
  return(Arrays.equals(s,l));
  }
    else
  {
      return(false);
  }}
 //sorting letters of word
public static char[] sort(String str)
{
char[] f=new char[str.length()];
for ( int i = 0; i < str.length(); ++i )
{
f[i]= str.charAt(i);
 }
Arrays.sort(f);
return(f);
}}
