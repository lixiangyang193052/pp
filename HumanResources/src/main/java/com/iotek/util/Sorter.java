package com.iotek.util;

import java.util.List;

public class Sorter {
    private static final int pageSize = 5;

    public static List<?> getCurrentList(List<?> list, int currentPage) {
        if (list == null || list.size() == 0) {
            return null;
        }
        int realCurrentPage = currentPage - 1;

        int index = realCurrentPage * pageSize;

        //总记录数
        Integer totalCount = list.size();

        //开始的索引
        Integer fromIndex = index;

        int toIndex = fromIndex + pageSize;

        if (toIndex > totalCount) {
            toIndex = totalCount;
        }

        List<?> currentList = list.subList(fromIndex, toIndex);

        return currentList;

    }

    public static int getTotalPage(int totalRows) {

        if (totalRows == 0) {
            return 1;
        }
        return totalRows % pageSize == 0 ? totalRows / pageSize : totalRows / pageSize + 1;
    }
}