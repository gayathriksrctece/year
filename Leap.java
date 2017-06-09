import java.io.*;
import java.util.*;
public class Leap
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int N=s.nextInt();
if(N%4==0)
{
System.out.println("It is a leap year");
}
else
{
System.out.println("It is not a leap year");
}
}
}
