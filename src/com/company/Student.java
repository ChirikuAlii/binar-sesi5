package com.company;

public class Student {
    private String nim;
    private String name;
    private String kelas;
    private String status;

    public Student(){

    }

    public Student(String nim, String name, String kelas, String status) {
        this.nim = nim;
        this.name = name;
        this.kelas = kelas;
        this.status = status;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
