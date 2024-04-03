package org.example.metier;

import org.example.dao.IDao;

public class MetierImpl implements Imetier {
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;

    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
