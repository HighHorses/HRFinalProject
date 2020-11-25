package com.hrproject.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页工具类
 * @param <T>待指定类型
 */
public class PageSupportHr<T> {
    private Integer pageIndex;
    private Integer pageSize;
    private Integer pageCount;
    private Integer curObjectNo;
    private Integer totalCount;

    private List<T> pagingList=new ArrayList<>();

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageCount() {
        pageCount=totalCount==0?(totalCount/pageSize):(totalCount/pageSize)+1;
        return pageCount;
    }

    public Integer getCurObjectNo() {
        this.curObjectNo=(pageIndex-1)*pageSize;
        return curObjectNo;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getPagingList() {
        return pagingList;
    }

    public void setPagingList(List<T> pagingList) {
        this.pagingList = pagingList;
    }
}
