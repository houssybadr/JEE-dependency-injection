package com.example.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.IDao;

@Component
public class MetierImpl implements IMetier{
    @Autowired
    private IDao dao;
    
    

    @Override
    public double calcul(){
        double t=this.dao.getData();
        return t*43/3;
    }
}
