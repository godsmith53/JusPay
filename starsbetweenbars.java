/*Question 1: Stars Between Bars
Given a string s consisting of stars “*” and bars  “|” ,an array of starting indices  starIndex,and an array of ending indices endIndex,determine the number of stars between any two bars within the substrings between the two indices inclusive . NOTE that in this problem indexing starts at 1.

A Star is represented as an asterisk [*=ascii decimal 42]
A Bar is represented as a Pipe [“|”=ascii decimal 124]
Example
    s=’|**|*|’ 
    startIndex=[1,1]
    endIndex=[5,6]

For the first pair of indices (1,5) the substrings is “|**|*”  . There are 2 stars between a pair of bars
For the second pair of indices (1,6) the substring is  “|**|*|” and there are 2+1=3 stars in between the bars.
Both of the answers are returned to the array [2,3].
Constraints
1<=n<=105
1<=StartInde[i]<=endIndex[i]
Each Character of s is either “*” or “|”
Input Format for Custom testing
First line contains a string S the next line contains an integer n , the no.of elements in startIndex. Each line i of the n subsequent lines contains an integer of startIndex.the next line contains an integer n , the no.of elements in endIndex. Each line i of the n subsequent lines contains an integer of endindex  

Sample Input
    *|*|  → s=”*|*|”
    1 → startindex[] size=1
    1 → startindex= 1
    1 → endindex[] size=1
    3 → endindex=3

Sample output:
    0

Explanation :
The substring from index =1 to index=3 is “*|*” . there is no consecutive pair of bars in this string. */
import java.util.*;

public  class Main{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String str=sc.next(); 
   int n=sc.nextInt(); 

   int startIndex[]=new int[n];
   int endIndex[]=new int[n];

   for(int i=0;i<n;i++)
     startIndex[i]=sc.nextInt();
   
   for(int i=0;i<n;i++)
     endIndex[i]=sc.nextInt();
   
   int count=0;

   for(int i=0;i<n;i++){
    count=0;
    String sub=str.substring(startIndex[i]-1,endIndex[i]);
    int start= sub.indexOf("|");
    int end=sub.lastIndexOf("|");
    for(int j=start;j<end;j++)
      if(sub.charAt(j)=='*')
         count++; 
    System.out.print(count+" ");
  } 
 }