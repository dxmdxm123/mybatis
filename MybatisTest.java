
import com.du.bean.CustomerExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;


public class MybatisTest {
    private SqlSession sqlSession;
    @Before
    public void befoe()throws Exception{
        //加载并读取
        String path = "SqlMapConfig.xml";
        InputStream is =Resources.getResourceAsStream(path);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        sqlSession = sqlSessionFactory.openSession();
        System.out.println("sqlSessionFactory = " + sqlSessionFactory);

    }
    @Test
    public void test01(){
        CustomerExample criteria = new CustomerExample();

    }
}
