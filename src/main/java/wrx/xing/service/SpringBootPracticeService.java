package wrx.xing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import wrx.xing.domain.SpringBootTest;
import wrx.xing.mapper.SpringBootPracticeMapper;

import java.util.List;

/**
 * Created by wrx on 2017/5/4.
 */
@Service
public class SpringBootPracticeService {
    @Autowired
    private SpringBootPracticeMapper mapper;

    @Transactional(readOnly = false)
    public void deleteById(int id) {
        mapper.deleteById(id);
        SpringBootTest springBootTest = new SpringBootTest();
        if (springBootTest.getAddress1().equals("aaa")) {
            System.out.println(2);
        }
        mapper.insert("hhh","男",222,"kkkkkkk");
    }

    public List<SpringBootTest> findByName(String name) {
        return mapper.findByName(name);
    }
}
