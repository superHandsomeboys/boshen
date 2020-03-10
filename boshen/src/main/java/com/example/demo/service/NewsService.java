package com.example.demo.service;

import com.example.demo.dto.NewsDTO;
import com.example.demo.dto.NewsInfo;
import com.example.demo.entity.News;
import com.example.demo.vo.PublicNews;
import com.example.demo.vo.ResultVo;
import com.example.demo.vo.SimpleNewsVO;

import java.util.List;

public interface NewsService {

    //添加新闻
    public ResultVo addNews(NewsInfo newsInfo);

    //删除新闻
    public ResultVo deleteNews(int newsId);

    //查询新闻，通过newsid,作者id,类型id，是否为轮播图，标题的模糊化，
    public List<News> findByNews(News news);

    //条件，分页查询
    public List<News> findByPageTitle(String title, int page);

    //条件页数查询
    public int findPageQuantityByTitle(String title);

    //设置轮播图
    public ResultVo updateIsSlider(News news);

    //根据newsid查询新闻详情页的所有数据
    public ResultVo findDetailedNewsVOByNewsId(Integer newsId);

    //查询i个新闻，如果i<=0，查询所有
    public List<SimpleNewsVO> findLimit(Integer i);

    //查轮播图的新闻
    public List<SimpleNewsVO> findByIsSlider();

    //根据类别id，查前i个新闻
    public List<SimpleNewsVO> findByCategoryId(int category, int i);

    //查找最热门的前i个新闻
    public List<SimpleNewsVO> findHotest(int i);

    //查找最新的前i个新闻
    public List<SimpleNewsVO> findNewest(int i);

    //从下标start开始，查找个quantity个新闻，封装NewsDTO中
    public List<NewsDTO> findNewsDTOLimit(int start, int quantity);

    //根据categoryId,从下标start开始，查找个quantity个新闻，封装NewsDTO中
    public List<NewsDTO> findByCategoryId02(int categoryId, int start, int quantity);

    //查询前4个新闻类别，再每个类别查询3个新闻
    public List<PublicNews> findPublicNews();

    //用newsid查newsdto
    public NewsDTO findNewsByNewsId(int newsId);
}