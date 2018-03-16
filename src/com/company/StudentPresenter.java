package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudentPresenter {
    private MainView view;


    public StudentPresenter(MainView view){
        this.view=view;
    }

    public void getStudentList(){
        List<Student>students = new StudentGenerator().generateStudentList();

        view.onLoading(true);

        if (students!=null){
            view.onSuccess(students);
        }
        else {
            view.onFailure("error: Data Null");
        }

    }
}
