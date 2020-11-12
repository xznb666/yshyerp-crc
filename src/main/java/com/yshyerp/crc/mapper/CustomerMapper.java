package com.yshyerp.crc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yshyerp.crc.entity.Customer;
import com.yshyerp.crc.response.dto.DropDownBoxDTO;

import java.util.List;

/**
 * @ClassName: CustomerMapper
 * @Author: xuzhen
 * @Date: 2020-11-12 15:38:54
 * @Description: 描述
 **/
public interface CustomerMapper extends BaseMapper<Customer> {
    List<DropDownBoxDTO> query();
}