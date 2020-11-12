package com.yshyerp.crc.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yshyerp.crc.mapper.CustomerMapper;
import com.yshyerp.crc.response.Response;
import com.yshyerp.crc.service.CustomerService;
import com.yshyerp.crc.utils.DropDownBoxUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName: CustomerServiceImpl
 * @Author: xuzhen
 * @Date: 2020-11-12 15:41:41
 * @Description: 描述
 **/
@Service
@Slf4j
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    /*
     * 查询“客户表”信息，更新“客户”下拉框
     */
    @Override
    public Response query() {
        JSONObject jsonObject = new JSONObject();
        String strList = JSON.toJSONString(DropDownBoxUtils.toDropDownBoxJSON(customerMapper.query())).replaceAll("\\s", "");
        jsonObject.put("",JSON.parse(strList));

        return Response.success("查询成功",jsonObject);
    }
}
