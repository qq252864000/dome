package com.userManager.dao;

import com.userManager.model.SellerInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: 欧阳正雄
 * @Date: 2018/6/22 0022 22:42
 * @Description:
 */
public interface SellerInfoMapper {

    int save(@Param("userInfo") List<SellerInfo> userInfo);

    int update(@Param("userInfo") List<SellerInfo> userInfo);
}
