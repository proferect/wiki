package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Demo;
import com.jiawa.wiki.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public Demo list(Long id){

        return  demoMapper.selectByPrimaryKey(id);
    }
}
