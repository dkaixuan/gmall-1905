package com.atguigu.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.pms.entity.Comment;
import com.atguigu.gmall.pms.mapper.CommentMapper;
import com.atguigu.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author kaixuan
 * @since 2020-03-14
 */

@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
