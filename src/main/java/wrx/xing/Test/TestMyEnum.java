package wrx.xing.Test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import wrx.xing.myEnum.HbUserDataType;
import wrx.xing.myEnum.MyEnumTest;

import java.time.LocalDateTime;

/**
 * Created by Administrator on 2017/3/30.
 */
public class TestMyEnum {
    @Test
    public void test(){
        int index = MyEnumTest.LOSE_SHEET.getIndex();
        String mes = MyEnumTest.LOSE_SHEET.getMes();
        System.out.println(index+"----"+mes);

    }
    @Test
    public void test1(){
        System.out.println(LocalDateTime.now().toLocalDate());
    }

    @Test
    public void test2(){
        String str = "~111";
        String[] split = StringUtils.split(str, "~");
        System.out.println(1);
    }

    @Test
    public void test3(){
        HbUserDataType hbUserDataType = HbUserDataType.valueOf(1000);
        String name = hbUserDataType.name();
        System.out.println(1);
    }

    public boolean range(int current,int min,int max){
        return Math.max(min,current) == Math.min(current,max);
    }
}
