public class Student{
    public String name;
    public int rollNumber;

    public void display(){
        System.out.println("Name: " + name + "\n" + " RollNumberr: " + rollNumber);
    
    }

     public static void main(String[]args){
        Student s1 = new Student();
        s1.name = "Annoited";
        s1.rollNumber = 02;
        s1.display();

        
        Student s2 = new Student();
        s2.name = "Heavenly";
        s2.rollNumber = 01;
        s2.display();

    }

}