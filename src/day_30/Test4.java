package day_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        city1.add("南京市");
        city1.add("扬州市");
        city1.add("苏州市");
        city1.add("无锡市");
        city1.add("常州市");

        ArrayList<String> city2 = new ArrayList<>();
        city2.add("武汉市");
        city2.add("孝感市");
        city2.add("十堰市");
        city2.add("宜昌市");
        city2.add("鄂州市");

        ArrayList<String> city3 = new ArrayList<>();
        city3.add("石家庄市");
        city3.add("唐山市");
        city3.add("邢台市");
        city3.add("保定市");
        city3.add("张家口市");

        map.put("江苏省", city1);
        map.put("湖北省", city2);
        map.put("河北省", city3);

        for (Map.Entry<String, List<String>> stringListEntry : map.entrySet()) {
            String province = stringListEntry.getKey();
            List<String> counties = stringListEntry.getValue();
            System.out.print(province + " = ");
            for (int i = 0; i < counties.size(); i++) {
                System.out.print(counties.get(i));
                if (i != counties.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

    }
}
