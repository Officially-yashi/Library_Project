package services;
import models.Student;
import java.util.ArrayList;
public class studentService
{
    private static ArrayList<Student> students = new ArrayList<Student>();

    public studentService()
    {
    }

    
    public static void putStudent(String name,String branch)
    {
        Student obj=new Student(students.size()+1,name,branch,0);
        students.add(obj);
    }
    public static Student getStudent(int id)
    {
       
         for(int i=0;i<students.size();i++)
         {
                
                if(students.get(i).id==id)
                {
                    return students.get(i);
                }
         }
         return null;
    }

}