/*There is an id code that is supposed to be given to all the aspirants of an exam. It is actually a substring of a given string. That means, the authority takes a string and then assigns all the unique substrings to all the students. Suppose there is a string “abcde”, so the ids of the students will be “a”, ”b”, ”c”, ”d”, ”e”, ’ab”, ”abc”,”abcd”,”abcde”,”bc”,”bcd”,”bcde”,”cd”,”cde”,”de”.
The students are standing in a line according to the lexicographic order of their given ids. You have to find out the id of the last student for the given input string from which the ids are generated.

Input Format:
Single line with the id generating string
Output format:
The last id as per lexicographical order
Constraints:
Number of characters in the string<=10^9
Sample Input:
    abdc

Sample output:
    dc

Explanation:
The last student will be with the id dc. The order will be
    abdc
    a
    ab
    abd
    abdc
    b
    bd
    bdc
    c
    d
    d */
    import java.util.*;
public class Main
{
  public static String maxString(char set[])
 {
   int n=set.length;
   String temp="";
   TreeSet<String> list=new TreeSet<>();
   for(int i=0;i<n;i++)
  {
     temp="";
     for(int j=i;j<n;j++)
    {
      temp=temp+set[j];
      list.add(temp);
    }
  }  
  return list.last();
 }
   public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);
   String str=sc.next();
   char arr[]=str.toCharArray();
   System.out.println(maxString(arr));
}
}