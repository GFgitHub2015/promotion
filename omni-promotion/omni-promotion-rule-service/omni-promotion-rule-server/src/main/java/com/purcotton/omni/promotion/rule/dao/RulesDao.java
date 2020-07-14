package com.purcotton.omni.promotion.rule.dao;
import com.purcotton.omni.promotion.rule.bean.Rules;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RulesDao {

//    @Select("SELECT * FROM drools_rule where id = #{id}")
    Rules getById(@Param("id") Integer id);

//    @Insert("INSERT INTO drools_rule(name,rulemapper) VALUE(#{name},#{rule})")
    Integer setRule(@Param("name") String name, @Param("rule") String rule);

//    @Select("SELECT * FROM drools_rule order by create_time DESC")
    List<Rules> getRuleList();

//    @Update("UPDATE drools_rule SET visible=0 WHERE id = #{id}")
    Integer deleteRule(@Param("id") Integer id);

//    @Update("UPDATE drools_rule SET rule= #{rule} AND name = #{name} WHERE id = #{id}")
    Integer updateRule(@Param("id") Integer id, @Param("name") String name, @Param("rule") String rule);
}
