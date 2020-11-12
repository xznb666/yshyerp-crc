package com.yshyerp.crc.controller;

import com.yshyerp.crc.controller.common.ControllerTemplate;
import com.yshyerp.crc.entity.Customer;
import com.yshyerp.crc.request.Request;
import com.yshyerp.crc.response.Response;
import com.yshyerp.crc.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: CustomerController
 * @Author: xuzhen
 * @Date: 2020-11-12 15:45:47
 * @Description: 描述
 **/
@Slf4j
@RestController
@RequestMapping("customer")
public class CustomerController implements ControllerTemplate<Customer> {
    @Autowired
    private CustomerService customerService;

    @Override
    public Response getDetail(String request) {
        return null;
    }

    @Override
    public Response getUpdateInit(String request) {
        return null;
    }

    @Override
    public Response addPost(Request<Customer> request) {
        return null;
    }

    @Override
    public Response delete(Request request) {
        return null;
    }

    @Override
    public Response updatePut(Request<Customer> request) {
        return null;
    }

    /*
     * 更新“客户”下拉框
     */
    @Override
    public Response getDropDownInit() {
        return customerService.query();
    }

    @Override
    public Response getAddDropDownInit() {
        return null;
    }

    @Override
    public Response postListInit(Request<Customer> request) {
        return null;
    }
}
