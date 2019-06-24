
import java.util.*;
public class Main
{
    static int count=0;
    public static int compute(String[] s){
        int i=0,j=0,k=0,east=0,west=0,north=0,south=0,length=0,value=0;
        
        if(s.length>1){
        
        while(i!=s.length){
       String[] str2=s[i].split(":");
       System.out.println(s[i]);
    //   if(str2.length>1){
            System.out.println("1+ days");
           
            j=0;
             System.out.println(str2[j]);
           while(j!=str2.length){
                if(str2[j].contains("E")){
                     System.out.println("east");
                    char[] ch=str2[j].toCharArray();
                    value=Character.getNumericValue(ch[ch.length-1]);
                  if(value>east){
                       east=value;
                       count++;
                       System.out.println(count);
                   }
               }
               else if(str2[j].contains("W")){
                   System.out.println("west");
                    char[] ch=str2[j].toCharArray();
                     value=Character.getNumericValue(ch[ch.length-1]);
                  if(value>west){
                       west=Integer.parseInt(""+ch[ch.length-1]);
                       count++;
                       System.out.println(count);
                   }
               }
               else if(str2[j].contains("N")){
                   System.out.println("north");
                    char[] ch=str2[j].toCharArray();
                     value=Character.getNumericValue(ch[ch.length-1]);
                  if(value>north){
                       north=Integer.parseInt(""+ch[ch.length-1]);
                       count++;
                       System.out.println(count);
                   }
               }
               else if(str2[j].contains("S")){
                   System.out.println("south");
                    char[] ch=str2[j].toCharArray();
                     value=Character.getNumericValue(ch[ch.length-1]);
                  if(value>south){
                       south=Integer.parseInt(""+ch[ch.length-1]);
                       count++;
                       System.out.println(count);
                   }
               }
               j++;
               System.out.println(j);
       }
            i++;
        }
       }else{
           System.out.println("1 day");
           String[] str1=s[0].split(":");
          while(k!=str1.length){
           if(str1[k].contains("E")){
               System.out.println("e");
               char[] ch=str1[k].toCharArray();
                value=Character.getNumericValue(ch[ch.length-1]);
               east=value; 
               count++;
               System.out.println(count);
           }
           else if(str1[k].contains("W")){
               System.out.println("w");
               char[] ch=str1[k].toCharArray();
                value=Character.getNumericValue(ch[ch.length-1]);
               west=value; 
               count++;
               System.out.println(count);
           }
            else if(str1[k].contains("N")){
                System.out.println("n");
               char[] ch=str1[k].toCharArray();
                value=Character.getNumericValue(ch[ch.length-1]);
               north=value;
               count++;
               System.out.println(count);
           }
            else if(str1[k].contains("S")){
                System.out.println("s");
               char[] ch=str1[k].toCharArray();
                value=Character.getNumericValue(ch[ch.length-1]);
               south=value;
               count++;
               System.out.println(count);
           }
           k++;
          }
       }
        
    return count;
    }
	public static void main(String[] args) {
	    String str="Day 1$ T1 - E - X - 4; Day 2$ T1 - W - X - 3: T2 - E - X - 3; Day 3$ T3 - N - X - 2: T2 - W - X - 4";
	    String[] str1=str.split(";");
	    int result=compute(str1);
	    System.out.println(result);
	}
}

