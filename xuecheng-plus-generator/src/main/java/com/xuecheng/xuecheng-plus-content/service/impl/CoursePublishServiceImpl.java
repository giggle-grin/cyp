package com.xuecheng.xuecheng-plus-content.service.impl;

import com.xuecheng.xuecheng-plus-content.model.po.CoursePublish;
import com.xuecheng.xuecheng-plus-content.mapper.CoursePublishMapper;
import com.xuecheng.xuecheng-plus-content.service.CoursePublishService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 课程发布 服务实现类
 * </p>
 *
 * @author itcast
 */
@Slf4j
@Service
public class CoursePublishServiceImpl extends ServiceImpl<CoursePublishMapper, CoursePublish> implements CoursePublishService {

}
