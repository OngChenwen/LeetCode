package DoorDash;

import java.util.*;

public class WebSitePagination {

    public static void main(String[] args) {
        String[][] items = new String[][]{
                {"item1","10","15"},
                {"item2","3","4"},
                {"item3","17","7"},
//                {"item4","22","3"},
//                {"item5","31","10"},
//                {"item6","23","6"},

        };

        List<String[]> output = fetchItems(items,1,0,2,1);
        for (String[] strings : output) {
            System.out.println(strings[0]);
        }
    }

    static List<String[]> fetchItems(String[][] items, int sortParameter, int sortOrder, int itemPerPage, int pageNumber){
        List<String[]> sortList = Arrays.asList(items);

        if (sortOrder == 0){
            sortList.sort(Comparator.comparingInt(o -> Integer.parseInt(o[sortParameter])));
        } else if(sortOrder == 1){
            sortList.sort(Comparator.comparingInt(o -> - Integer.parseInt(o[sortParameter])));
        }

        List<List<String[]>> ans = spliceArrays(sortList,itemPerPage);

        return ans.get(pageNumber);
    }

    private static List<List<String[]>> spliceArrays(List<String[]> datas, int splitSize) {
        if (datas == null || splitSize < 1) {
            return  null;
        }
        int totalSize = datas.size();
        //获取要拆分子数组个数
        int count = (totalSize % splitSize == 0) ?
                (totalSize / splitSize) : (totalSize/splitSize+1);

        List<List<String[]>> rows = new ArrayList();
        for (int i = 0;i < count;i ++) {

            int index = i * splitSize;
            List<String[]> cols = new ArrayList();
            int j = 0;
            while (j < splitSize && index < totalSize) {
                cols.add(datas.get(index++));
                j ++;
            }
            rows.add(cols);
        }
        return rows;
    }



}
