package com.example.ext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.dao.IDao;

@Component
public class DaoImplV2 implements IDao{
    public DaoImplV2(){}

    @Override
    public double getData(){
        System.out.println("version web service");
        return 41;
    }
}
