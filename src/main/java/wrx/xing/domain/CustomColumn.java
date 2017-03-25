package wrx.xing.domain;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wrx on 2017/3/24.
 */
public class CustomColumn {
    public List<Map<String,String>> selectColumn = new ArrayList<>();

    public static CustomColumn createCustomColumn(){
        return new CustomColumn();
    }

    public CustomColumn add(String column,String asName){
        Map<String,String> map = new LinkedHashMap<>();
        map.put("column",column);
        map.put("asName",asName);
        selectColumn.add(map);
        return this;
    }
}
