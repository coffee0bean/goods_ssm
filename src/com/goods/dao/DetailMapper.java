package com.goods.dao;

import com.goods.bean.Detail;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public interface DetailMapper {

    @Select({
            "select d.*,s.name as sortName from goods_detail d,goods_sort s where sortId = s.id"
    })
    public List<Detail> selectDetail();

    @Select({
            "select d.*,s.name as sortName from goods_detail d,goods_sort s where d.id = #{id} and sortId = s.id"
    })
    public Detail selectDetailById(int id);

    @Insert({
            "insert into goods_detail value(default,#{sortId},#{name},#{address},#{price},#{createDate},#{remaining})"
    })
    public int addDetail(Detail detail);

    @Delete({
            "delete * from goods_detail where id = #{id}"
    })
    public int deleteDetail(int id);

    @Update({
            "update goods_detail set ",
            "sortId = #{srtId},name = #{name},address = #{address},price = #{price},",
            "createDate= #{createDate},remaining = #{remaining}",
            "where id = #{id}"
    })
    public int updateDetail(Detail detail);

}
