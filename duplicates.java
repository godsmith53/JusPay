/*The principal has a problem with repetitions. Everytime someone sends the same email twice he becomes angry and starts yelling. His personal assistant filters the mails so that all the unique mails are sent only once, and if there is someone sending the same mail again and again, he deletes them. Write a program which will see the list of roll numbers of the student and find how many emails are to be deleted.

Sample Input:
    6
    1
    3
    3
    4
    3
    3

Sample Output:
    3 */
    import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    TreeSet list=new TreeSet<>();
    for(int i=0;i<n;i++)
      list.add(sc.nextInt()); 
    
    System.out.println(Math.abs(n-list.size()));
 }
}