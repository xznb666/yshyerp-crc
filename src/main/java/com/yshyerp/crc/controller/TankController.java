package com.yshyerp.crc.controller;

import com.yshyerp.crc.controller.common.ControllerTemplate;
import com.yshyerp.crc.entity.Tank;
import com.yshyerp.crc.request.Request;
import com.yshyerp.crc.response.Response;
import com.yshyerp.crc.service.TankService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TankController
 * @Author: xuzhen
 * @Date: 2020-11-12 14:32:53
 * @Description: 描述
 **/
@Slf4j
@RestController
@RequestMapping("tank")
public class TankController implements ControllerTemplate<Tank> {
    @Autowired
    TankService tankService;

    @Override
    public Response getDetail(String request) {
        return null;
    }

    @Override
    public Response getUpdateInit(String request) {
        return null;
    }

    @Override
    public Response addPost(Request<Tank> request) {
        return null;
    }

    @Override
    public Response delete(Request request) {
        return null;
    }

    @Override
    public Response updatePut(Request<Tank> request) {
        return null;
    }

    @Override
    public Response getDropDownInit() {
        return null;
    }

    @Override
    public Response getAddDropDownInit() {
        return null;
    }

    @Override
    public Response postListInit(Request<Tank> request) {
        return null;
    }
}
