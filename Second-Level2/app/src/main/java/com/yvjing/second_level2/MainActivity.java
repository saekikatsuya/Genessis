package com.yvjing.second_level2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Student> studentList=new ArrayList<Student>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.list_view);
        StudentAdapter adapter = new StudentAdapter(MainActivity.this, R.layout.list_item, studentList);
    }

        private void initItem(){
            Student one = new Student("学生1", "年级1");
            Student two = new Student("学生2", "年级2");
            Student three = new Student("学生3", "年级3");
            Student four = new Student("学生4", "年级4");
            Student five = new Student("学生5", "年级5");
            Student six = new Student("学生6", "年级6");
            Student seven = new Student("学生7", "年级7");

            studentList.add(one);
            studentList.add(two);
            studentList.add(three);
            studentList.add(four);
            studentList.add(five);
            studentList.add(six);
            studentList.add(seven);
        }

    }

