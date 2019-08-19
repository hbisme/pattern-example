package flyweight;

import java.util.HashMap;
import java.util.Map;

public class CrayonFactory {
    private static Map<String, ICrayon> data = new HashMap<>();

    // 如果map中有指定颜色的蜡笔,直接取出, 否则 创建指定颜色蜡笔,放入map中.
    public static ICrayon getCrayon(String color){
        if(data.containsKey(color)) {
            return data.get(color);
        }
        ICrayon crayon = new Crayon(color);
        data.put(color, crayon);
        return crayon;
    }


}
