package models;
public class Student
{   public int id;
    public String name;
    public String branch;
    public int borrowedbooks;
    
   public Student(int id, String name,String branch,int borrowedbooks)
    {
        this.id=id;
        this.name=name;
        this.branch=branch;
        this.borrowedbooks=borrowedbooks;
    }
}