package wrx.xing.myEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wrx on 2017/03/30.
 */
public interface IEnum {
  public int getIndex();

  public static class IEnumUtil {

    private static final int WORNNING_MAX_INDEX = 100;

    public static <E extends IEnum> List<E> toIndexes(E[] enums) {
      int maxIndex = Integer.MIN_VALUE;
      int curIdx = 0;
      // 找到最大index，此值+1就是结果list的size
      for (E enm : enums) {
        curIdx = enm.getIndex();
        // 索引不能为负
        if (curIdx < 0) {
          // TODO
        }
        if (curIdx > maxIndex) {
          maxIndex = curIdx;
        }
      }
      if (maxIndex >= WORNNING_MAX_INDEX) {
        // TODO
      }
      List<E> instances = new ArrayList<E>(maxIndex + 1);
      // 先全用null填充
      for (int i = 0; i < maxIndex + 1; i++) {
        instances.add(null);
      }
      for (E enm : enums) {
        curIdx = enm.getIndex();
        // 索引必须唯一
        if ((instances.get(curIdx) == null)) {
          // TODO
        }
        instances.set(curIdx, enm);
      }
      return instances;
    }

    public static <E extends IEnum> E getIndex(E[] enums, int index) {
      if (enums == null) {
        return null;
      }
      final int _enumSize = enums.length;

      if (_enumSize < index) {
        return null;
      } else {
        E _result = null;
        for (E e : enums) {
          if (e.getIndex() == index) {
            _result = e;
            break;
          }
        }
        return _result;
      }
    }

    public static <E extends IEnum> E indexOf(final E[] enums,
                                              final int index) {
      return index >= 0 && index < enums.length ? enums[index] : null;
    }

    public static <E extends IEnum> E indexOfNotNull(final E[] enums,
                                                     final int index) {
      E result = indexOf(enums, index);
      if (result == null) {
        result = enums.length > 0 ? enums[0] : null;
      }
      return result;
    }

    public static int buildMask(IEnum... enums) {
      if (enums == null) {
        return 0;
      }
      int i = 0;
      for (IEnum e : enums) {
        i |= (1 << e.getIndex());
      }
      return i;
    }
  }
}
