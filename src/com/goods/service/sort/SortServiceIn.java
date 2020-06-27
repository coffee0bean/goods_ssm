package com.goods.service.sort;

import com.goods.bean.Sort;

import java.util.List;

public interface SortServiceIn {

    public List<Sort> selectSort();

    public int addSort(Sort sort);

    public int deleteSort(int id);

    public int updateSort(Sort sort);

}
