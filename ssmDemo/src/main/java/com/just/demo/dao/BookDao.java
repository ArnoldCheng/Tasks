package com.just.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.just.demo.entity.Book;

public interface BookDao {

    /**
     * ͨ��ID��ѯ����ͼ��
     * 
     * @param id
     * @return
     */
    Book queryById(long id);

    /**
     * ��ѯ����ͼ��
     * 
     * ���������������ϵĲ�����Ҫ��@Paramע�⣬�Ա�mybatisʶ��
     * 
     * @param offset ��ѯ��ʼλ��
     * @param limit ��ѯ����
     * @return
     */
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * ���ٹݲ�����
     * 
     * @param bookId
     * @return ���Ӱ����������>1����ʾ���µļ�¼����
     */
    int reduceNumber(long bookId);
}