package com.goods.service.detail;

import com.goods.bean.Detail;

import java.util.List;

public interface DetailServiceIn {

    public List<Detail> selectDetail();

    public Detail selectDetailById(int id);

    public int addDetail(Detail detail);

    public int deleteDetail(int id);

    public int updateDetail(Detail detail);
}
