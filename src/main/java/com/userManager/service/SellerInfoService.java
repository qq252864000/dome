package com.userManager.service;

import com.userManager.model.SellerInfo;

import java.util.List;

/**
 * @Auther: 欧阳正雄
 * @Date: 2018/6/22 0022 22:53
 * @Description:
 */
public interface SellerInfoService {


    void save(List<SellerInfo> sellerInfo);

    void update(List<SellerInfo> sellerInfo);
}
