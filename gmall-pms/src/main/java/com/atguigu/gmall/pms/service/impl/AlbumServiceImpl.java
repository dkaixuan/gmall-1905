package com.atguigu.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.pms.entity.Album;
import com.atguigu.gmall.pms.mapper.AlbumMapper;
import com.atguigu.gmall.pms.service.AlbumService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author kaixuan
 * @since 2020-03-14
 */

@Service
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper, Album> implements AlbumService {

}
