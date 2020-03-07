package com.gpnu.boshen.service;

import com.gpnu.boshen.dto.WikiDTO;
import com.gpnu.boshen.entity.Wiki;

import java.util.List;

public interface WikiServie {

    /**
     * 删除wiki
     * @param id
     * @return
     */
    public int deleteWiki(int id);

    /**
     * 条件，分页查询
     */
    public List<WikiDTO> findByPageTitle(String title, int page);

    /**
     * 条件查询页数
     */
    public int findPageQuantityByTitle(String title);

    /**
     * 用id查wikidto
     */
    public WikiDTO findByid(int id);
}
