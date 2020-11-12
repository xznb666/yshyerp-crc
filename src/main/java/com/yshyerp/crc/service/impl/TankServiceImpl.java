package com.yshyerp.crc.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.yshyerp.crc.entity.Tank;
import com.yshyerp.crc.mapper.TankMapper;
import com.yshyerp.crc.response.Response;
import com.yshyerp.crc.service.TankService;
import com.yshyerp.crc.utils.DropDownBoxUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * @ClassName: TankServiceImpl
 * @Author: xuzhen
 * @Date: 2020-11-12 14:32:27
 * @Description: TankService实现类
 **/
@Service
@Slf4j
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class TankServiceImpl implements TankService {
    @Autowired
    private TankMapper tankMapper;

}
