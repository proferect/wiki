package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public Ebook list(Long id){

        return  ebookMapper.selectByPrimaryKey(id);
    }
}
