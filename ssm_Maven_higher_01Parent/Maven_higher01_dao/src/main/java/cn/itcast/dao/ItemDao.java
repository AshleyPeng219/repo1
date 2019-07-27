package cn.itcast.dao;


import cn.itcast.domain.Item;
import org.apache.ibatis.annotations.Select;

public interface ItemDao {

    @Select("select * from items where id = #{id} ")
    public Item findOneById(Integer id);
}
