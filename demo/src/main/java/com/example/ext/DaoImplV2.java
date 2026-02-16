package com.example.ext;
import com.example.dao.IDao;
public class DaoImplV2 implements IDao{
    public DaoImplV2(){}

    @Override
    public double getData(){
        System.out.println("version web service");
        return 41;
    }
}
