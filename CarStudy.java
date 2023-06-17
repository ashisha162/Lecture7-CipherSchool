import java.util.*;
class car  //class is a blue print of an object//
{
String name;
int year;
int max_speed;
String color;
void acceleration()
{
System.out.println("car is accelerating");
}
}
public class CarStudy
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
car polo=new car();
System.out.println(polo.name);
System.out.println(polo.year);
System.out.println(polo.max_speed);
System.out.println(polo.color);
}
}
