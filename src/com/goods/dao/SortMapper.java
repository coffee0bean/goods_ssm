package com.goods.dao;

import com.goods.bean.Sort;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import javax.annotation.Resource;
import java.util.List;
@Resource
public interface SortMapper {

    @Select({
            "select * from goods_sort"
    })
    public List<Sort> selectSort();

    @Select({
            "select * from goods_sort where id = #{id}"
    })
    public List<Sort> selectSortById(int id);

    @Insert({
            "insert into goods_sort(default,#{id},#{name})"
    })
    public int addSort(Sort sort);

    @Delete({
            "delete * from goods_sort where id = #{id}"
    })
    public int deleteSort(int id);

    @Update({
            "update goods_sort set name = #{name} where id = #{id}"
    })
    public int updateSort(Sort id);

}
