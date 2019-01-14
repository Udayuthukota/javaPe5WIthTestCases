package com.stackroute.pe5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class MainTest
{
    public List<Student> studentInfo()
    {
        Student obj1 = new Student(1, "Saurabh", 22);
        Student obj2 = new Student(3, "Sam", 24);
        Student obj3 = new Student(2, "Bhanu", 20);
        Student obj4 = new Student(4, "Evangeline", 10);
        Student obj5 = new Student(5, "Jaanu", 22);
        List<Student> list = new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        System.out.println(list);

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