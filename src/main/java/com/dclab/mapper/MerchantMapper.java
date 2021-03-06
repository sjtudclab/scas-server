package com.dclab.mapper;

import com.dclab.entity.Merchant;

import java.util.List;

public interface MerchantMapper {
    int deleteByPrimaryKey(Integer merchantId);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(Integer merchantId);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);

    Merchant findMerchant(String merchantName, String address);

    List<Merchant> getMerchants();
}