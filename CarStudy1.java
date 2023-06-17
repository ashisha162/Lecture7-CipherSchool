import java.util.*;
class car  //class is a blue print of an object//
{
String name;
int year;
int maxspeed;
String color;
void acceleration()
{
System.out.println("car is accelerating");
}
}
public class CarStudy1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
car polo=new car();


polo.name= "Polo";
polo.year=2021;
polo.maxspeed=120;
polo.color="Red";


System.out.println(polo.name);
System.out.println(polo.year);
System.out.println(polo.maxspeed);
System.out.println(polo.color);
}
}
