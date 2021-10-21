package com.example.hbculturestat.service.impl;

import com.example.hbculturestat.entity.FyAssetsCity;
import com.example.hbculturestat.mapper.FyAssetsCityMapper;
import com.example.hbculturestat.service.IFyAssetsCityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 14年各地区非物质文化遗产资产表 服务实现类
 * </p>
 *
 * @author sqs
 * @since 2021-10-19
 */
@Service
public class FyAssetsCityServiceImpl extends ServiceImpl<FyAssetsCityMapper, FyAssetsCity> implements IFyAssetsCityService {

    @Autowired
    private FyAssetsCityMapper assetsCityMapper;
    @Override
    public List<FyAssetsCity> getFyAssets() {
        return assetsCityMapper.getFyAssets();
    }
}
