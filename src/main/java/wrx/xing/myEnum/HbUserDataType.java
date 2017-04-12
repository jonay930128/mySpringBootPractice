package wrx.xing.myEnum;

/**
 * Created by wrx on 2017/04/10.
 */

import java.util.List;

/**
 * Filter 中数字大小比较情况
 */
public enum HbUserDataType implements IEnum {

  EF(1000, "排放因子"),
  ETA(1001, "去除效率"),
  ENV(1002, "气象参数"),
  SOCIETY(1003, "社会经济参数"),
  PY(1004, "源谱数据"),
  SK(1005,"时空分配系数");

  private final int index;
  private final String name;

  HbUserDataType(int index, String name) {
    this.index = index;
    this.name = name;
  }

  private final static List<HbUserDataType> VALUES = IEnumUtil
          .toIndexes(HbUserDataType.values());

  public static HbUserDataType valueOf(final int index) {
    if (index < 0) {
      return null;
    }
    return VALUES.get(index);
  }

  public static int getIndex(String name){
    int index = -1;
    HbUserDataType[] values = HbUserDataType.values();
    for (HbUserDataType value : values) {
      if (value.equals(name)) {
        index = value.getIndex();
        break;
      }
    }
    return index;
  }

  public static String getName(int index){
    String name = null;
    HbUserDataType[] values = HbUserDataType.values();
    for (HbUserDataType value : values) {
      if (value.getIndex() == index) {
        name = value.getName();
      }
    }
    return name;
  }

  @Override
  public int getIndex() {
    return index;
  }

  public String getName() {
    return name;
  }
}
