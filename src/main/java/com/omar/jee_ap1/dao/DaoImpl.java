package com.omar.jee_ap1.dao;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public Date getDate() {
        System.out.println("Version DB");
        return new Date();
    }
}

