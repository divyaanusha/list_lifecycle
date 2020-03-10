package epam.list;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	List<String> l;//List interface declaration
    	l=new ArrayList<String>(10);//creating ArrayList with initial capacity 10,type:string
    	
    	Scanner sc = new Scanner(System.in);
    	Iterator<String> i;//declaring iterator 
    	String element;
    	int element_index;
    	Boolean stopper=false;
 	   while(!stopper)
 	   {
 		   System.out.println("enter:1.Fetching  2.adding  3.removing by name  4.printing 5.to stop cycle");
 		   int choice=sc.nextInt();//choosing the choice of operation to perform
 		   switch(choice) {
 		   case 1:
 			   if(!l.isEmpty())//checking the list is empty 
 			   {
 				   //if its is not empty performing fetching
 				   System.out.println("enter from 0 to "+(l.size()-1)+"..... ");
 				  element_index=sc.nextInt();
 	 			  System.out.println(l.get(element_index));
 			   }
 			   else {
 				   System.out.println("the list is empty to fetch");
 			   }
 			  
 			 break;
 		  case 2:
 			  //adding elements to list
 			  System.out.println("Eneter an element to add into the arraylist: ");
 			  element=sc.next();
 			  l.add(element);
 			  break;
 		  case 3:
 			  //removing elements from list
 			  System.out.println("enter the element to be removed: ");
 			  element=sc.next();
 			  l.remove(element);
 			  break;
 		  case 4:
 			  //printing the entire list using iterator
 			 i = l.iterator();
 			 while(i.hasNext())
 			 {
 				 System.out.println(i.next());
 			 }
 			 break;
 		  case 5:
 			  //stopper made to true to stop process
 			  sc.close();
 			  stopper=true;
 			  break;
 		  default:
 			  //default for switch case
 			 System.out.println("invalid choice");
 			  
 	 } 
    }
 	   System.out.println("life cycle completed....");
    }
}
