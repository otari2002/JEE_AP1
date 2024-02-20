package com.omar.jee_ap1.metier;

import com.omar.jee_ap1.dao.IDao;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component("metier")
public class MetierImpl implements IMetier {
    private IDao dao;
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public Date calcul() {

        return dao.getDate();
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}


