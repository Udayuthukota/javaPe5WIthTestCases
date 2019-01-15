/*Create a Student class that represents the following information of a
student: id, name, and age allthe member variables should be private .a.Implement `getter and setter` .
 b. Create a `StudentSorter` class that implements `Comparator interface` .
 c. Write a class `Maintest` create Student class
 object(minimum 5)d. Add these student object into a List of type Student
 e. Sort the list based on their age in decreasing order, for student having sameage, sort based on their name.
 f. For students having same name and age, sort them according to their ID.
 */
package com.stackroute.pe5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class MainTest
{
    public List<Student> studentInfo()
    {
        Student student1 = new Student(1, "uday", 22);
        Student student2 = new Student(3, "Sam", 24);
        Student student3 = new Student(2, "Bhanu", 20);
        Student student4 = new Student(4, "Evangeline", 10);
        Student student5 = new Student(5, "Jane", 22);
        List<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        //System.out.println(list);
        Collections.sort(list, new StudentSorter());
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge());
        }
        return list;
    }
}

class Student
{
    /* Private Member variables of student class*/
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

class StudentSorter implements Comparator<Student>
{
    public int compare(Student stu1,Student stu2)
    {
        if(stu1.getAge()>stu2.getAge())
            return stu1.getAge()-stu2.getAge();
        else if(stu1.getAge()==stu2.getAge()&&!stu1.getName().equals(stu2.getName()))
            return stu1.getName().compareToIgnoreCase(stu2.getName());
        else
            return stu1.getId()-stu2.getId();
    }
}