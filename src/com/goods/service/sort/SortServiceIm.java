package com.goods.service.sort;

import com.goods.bean.Sort;
import com.goods.dao.SortMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortServiceIm implements SortServiceIn {

    @Autowired
    private SortMapper sm;

    @Override
    public List<Sort> selectSort() {
        return sm.selectSort();
    }

    @Override
    public int addSort(Sort sort) {
        return sm.addSort(sort);
    }

    @Override
    public int deleteSort(int id) {
        return sm.deleteSort(id);
    }

    @Override
    public int updateSort(Sort sort) {
        return sm.updateSort(sort);
    }
}
