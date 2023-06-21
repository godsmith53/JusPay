/*Stephan is a vampire. And he is fighting with his brother Damon. Vampires get energy from human bloods, so they need to feed on human blood, killing the human beings. Stephan is also less inhuman, so he will like to take less life in his hand. Now all the people’s blood has some power, which increases the powers of the Vampire. Stephan just needs to be more powerful than Damon, killing the least human possible. Tell the total power Steohan will have after drinking the bloods before the battle.

Note : Damon is a beast, so no human being will be left after Damon drinks everyone’s blood. But Stephan always comes early in the town.

Input Format:
First line with the number of people in the town, n.
Second line with a string with n characters, denoting the one digit power in every blood.
Output Format:
Total minimum power Stephan will gather before the battle.

Constraints:
n<=10^4
Sample input:
6   
093212
Sample output
9
Explanation:
Stephan riches the town, drinks the blood with power 9. Now Damon cannot reach 9 by drinking all the other bloods. */
import java.util.*;
public class Main
{
  public static void main(String[] args)
{
      Scanner sc=new Scanner(System.in);
      int  n=sc.nextInt();
      String str=sc.next();
      char arr[]=str.toCharArray();
      int a[]=new int[arr.length];
      for(int i=0;i<a.length;i++)
         a[i]=Integer.parseInt(arr[i]+"");
 
      Arrays.sort(a);
      int sum=0;
      for(int i=0;i<a.length;i++) sum=sum+a[i]; int sumA=0; int sumB=sum; ArrayList subsetA=new ArrayList(); for(int i=a.length-1;i>=0;i--)
    {
        sumA=sumA+a[i];
        sumB=sumB-a[i];
        subsetA.add(a[i]);
        if(sumA>sumB)
           break; 
     }
  
    Iterator itr=subsetA.iterator();
    while(itr.hasNext())
   {

      System.out.print((Integer)itr.next());
    }
  }
}