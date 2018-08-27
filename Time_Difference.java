import java.io.*;
import java.util.*;

  public class Time_Difference{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Time 1:");
      System.out.println("HR:");
      int Hour1=sc.nextInt();
      System.out.println("Min:");
      int Minutes1=sc.nextInt();
      System.out.println("Enter Time 2:");
      System.out.println("HR:");
      int Hour2=sc.nextInt();
      System.out.println("Min:");
      int Minutes2=sc.nextInt();
      System.out.println("Difference between Two Given time Is:");
      int Hr_Differ=Hour1-Hour2;
      int Min_Differ=Minutes1-Minutes2;
      System.out.println(Hr_Differ+":"+Min_Differ);
      }
     } 
      
