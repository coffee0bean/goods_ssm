package com.goods.service.detail;

import com.goods.bean.Detail;
import com.goods.dao.DetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailServiceIm implements DetailServiceIn {

    @Autowired
    private DetailMapper dm;

    @Override
    public List<Detail> selectDetail() {
        return dm.selectDetail();
    }

    public Detail selectDetailById(int id){
        return dm.selectDetailById(id);
    }

    @Override
    public int addDetail(Detail detail) {
        return dm.addDetail(detail);
    }

    @Override
    public int deleteDetail(int id) {
        return dm.deleteDetail(id);
    }

    @Override
    public int updateDetail(Detail detail) {
        return dm.updateDetail(detail);
    }
}
