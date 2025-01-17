package Services;
import Models.Student;
import java.util.ArrayList;
class studentService
{
    private ArrayList<Student> students =new ArrayList<Student>();
    public void putStudent(String name,String branch)
    {
        Student obj=new Student(students.size+1,name,branch,0);
        students.add(obj);
    }
    public Student getStudent(int id)
    {
       
         for(int i=0;i<students.size();i++)
         {
                if(students[i].id==id)
                {
                    return students[i];
                }
         }
         return null;
    }
}