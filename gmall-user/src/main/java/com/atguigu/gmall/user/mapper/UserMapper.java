package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.UmsMember;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.List;
@Mapper
public interface UserMapper extends BaseMapper<UmsMember> {


}
