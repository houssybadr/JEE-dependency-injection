package com.example.dao;

public class DaoImpl implements IDao{
    public DaoImpl(){};

    @Override
    public double getData(){
        System.out.println("Version Base de donne");
        double temp =23;
        return temp;
    }
}
