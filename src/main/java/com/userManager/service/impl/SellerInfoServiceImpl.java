package com.userManager.service.impl;

import com.userManager.dao.SellerInfoMapper;
import com.userManager.model.SellerInfo;
import com.userManager.service.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 欧阳正雄
 * @Date: 2018/6/22 0022 22:55
 * @Description:
 */
@Service
public class SellerInfoServiceImpl implements SellerInfoService {

    @Autowired
    private SellerInfoMapper sellerInfoMapper;


    @Override
    public void save(List<SellerInfo> sellerInfo) {
        sellerInfoMapper.save(sellerInfo);
    }

    @Override
    public void update(List<SellerInfo> sellerInfo) {
        sellerInfoMapper.update(sellerInfo);
    }
}
