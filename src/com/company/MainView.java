package com.company;

import java.util.List;

public interface MainView {
    void onSuccess(List<Student> students);
    void onLoading(boolean isLoading);
    void onFailure(String s);
}
