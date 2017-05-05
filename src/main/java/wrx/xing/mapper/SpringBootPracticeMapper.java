package wrx.xing.mapper;

import org.apache.ibatis.annotations.*;
import wrx.xing.domain.SpringBootTest;

import java.util.List;

/**
 * Created by Administrator on 2017/2/22.
 */
@Mapper
public interface SpringBootPracticeMapper {

    @Insert("INSERT INTO springboot_test(name,sex,age,address) VALUES(#{name},#{sex},#{age},#{address})")
    int insert(@Param("name") String name,
               @Param("sex") String sex,
               @Param("age") Integer age,
               @Param("address") String address);

    @Select("SELECT * FROM springboot_test WHERE id = #{id}")
    SpringBootTest findById(@Param("id") int id);

    @Results({
            @Result(property = "name1", column = "name"),
            @Result(property = "age1", column = "age"),
            @Result(property = "sex1", column = "sex"),
            @Result(property = "address1", column = "address")
    })
    @Select("select name,age from springboot_test where name = #{0}")
    List<SpringBootTest> findByName(String name);

    @Delete("delete from springboot_test where id = #{id}")
    int deleteById(int id);
}
