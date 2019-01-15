package com.stackroute.pe5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
public class MainTestTest
{
    MainTest mainTest;
    @Before
    public void setUp() throws Exception
    {
        mainTest = new MainTest();
    }

    @After
    public void tearDown() throws Exception
    {
        mainTest = null;
    }
    //pass case for sample input
    @Test
    public void studentInfo()
    {
        Student student1 = new Student(1, "uday", 22);
        Student student2 = new Student(2, "Bhanu", 20);
        Student student3 = new Student(3, "Sam", 24);
        Student student4 = new Student(4, "Evangeline", 10);
        Student student5 = new Student(5, "Jane", 22);
        List<Student> list=new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        List<Student> ans=mainTest.studentInfo();
        String expected="",actual="";
        for(int i=0;i<list.size();i++)
        {
            expected+=list.get(i).getId()+" "+list.get(i).getName()+" "+list.get(i).getAge()+" ";
        }
        for(int j=0;j<ans.size();j++)
        {
            actual+=ans.get(j).getId()+" "+ans.get(j).getName()+" "+ans.get(j).getAge()+" ";

        }
        assertEquals(expected,actual);
    }
}