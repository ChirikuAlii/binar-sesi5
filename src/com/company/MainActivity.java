package com.company;

import java.util.List;

public class MainActivity implements MainView{

    public void onCreate() {

        StudentPresenter presenter = new StudentPresenter(this);

        presenter.getStudentList();
    }

    @Override
    public void onSuccess(List<Student> students) {
        for (int i = 0; i <students.size() ; i++) {
            if(students.get(i).getStatus().equals("alumni")) continue;
            System.out.println("Nim:"+ students.get(i).getNim());
            System.out.println("Nama:"+ students.get(i).getName());
            System.out.println("Kelas"+ students.get(i).getKelas());
            System.out.println("Status"+ students.get(i).getStatus());
            System.out.println();
        }
    }

    @Override
    public void onLoading(boolean isLoading) {
        System.out.println("Loading"+ isLoading);
    }

    @Override
    public void onFailure(String s) {
        System.out.println(s);
    }
}
