//We can copy the values of one object into another by assigning
//the objects values to another object.
//In this case, there is no need to create the constructor.
package Constructor;

public class CopyingValuesWidoutConstructor {  
    int id;  
    String name;  
    CopyingValuesWidoutConstructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    CopyingValuesWidoutConstructor(){}  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    	CopyingValuesWidoutConstructor s1 = new CopyingValuesWidoutConstructor(111,"Karan");  
    	CopyingValuesWidoutConstructor s2 = new CopyingValuesWidoutConstructor();  
    s2.id=s1.id;  
    s2.name=s1.name;  
    s1.display();  
    s2.display();  
   }  
}  
