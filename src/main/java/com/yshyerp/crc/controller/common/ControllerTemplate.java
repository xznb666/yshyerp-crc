package com.yshyerp.crc.controller.common;
import com.yshyerp.crc.request.Request;
import com.yshyerp.crc.response.Response;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: yinsongjia
 * @Data: 2020/11/5
 * @Description:
 */
public interface ControllerTemplate<T> {


    /**
     * 获取指定的数据
     * @return
     */
    @GetMapping("getDetail/{request}")
    Response getDetail(@PathVariable String request);


    /**
     * 页面数据上面下拉框初始化数据
     * @return
     */
    @GetMapping("getUpdateInit/{request}")
    Response getUpdateInit(@PathVariable String request);

    /**
     * 添加数据
     * @return
     */
    @PostMapping("addPost")
    Response addPost(@RequestBody  Request<T> request);


    /**
     * 删除数据
     * @return
     * @param request
     */
    @DeleteMapping("delete")
    Response delete(@RequestBody Request request);

    /**
     * 修改数据
     * @return
     */
    @PutMapping("updatePut")
    Response updatePut(@RequestBody Request<T> request);

    /**
     * 页面数据上面下拉框初始化数据
     * @return
     */
    @GetMapping("getDropDownInit")
    Response getDropDownInit();

    /**
     * 添加页面所需要的下拉框初始化数据
     * @return
     */
    @GetMapping("getAddDropDownInit")
    Response getAddDropDownInit();

    /**
     * 页面数据List初始化 支持分页
     * @return
     */
    @PostMapping("postListInit")
    Response postListInit(@RequestBody Request<T> request);
}