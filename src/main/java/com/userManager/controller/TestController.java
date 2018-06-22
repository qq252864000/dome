package com.userManager.controller;

import com.userManager.model.SellerInfo;
import com.userManager.service.impl.SellerInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 欧阳正雄
 * @Date: 2018/6/22 0022 22:35
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SellerInfoServiceImpl sellerInfoService;

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        List<SellerInfo> sellerInfoList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SellerInfo sellerInfo = new SellerInfo();
            sellerInfo.setSellerId("12345"+i);
            sellerInfo.setUserName("王老五"+i);
            sellerInfo.setPassword("6666"+i);
            sellerInfo.setOpenid("99999"+i);
            sellerInfoList.add(sellerInfo);
        }
        sellerInfoService.update(sellerInfoList);
        return "success";
    }
}
