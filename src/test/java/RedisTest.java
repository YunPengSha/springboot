import com.google.gson.Gson;
import com.note.Application;
import com.note.util.RedisUtil;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RedisTest {

  private static final Logger logger = LoggerFactory.getLogger(Application.class);
  @Resource
  private RedisUtil redisUtil;

  @Test
  public void contextLoads() {
    print(redisUtil.get("a"));
    boolean set = redisUtil.set("a","KFC",60);
    if (set) {
      System.out.println("success");
    }
  }


  private void print(Object obj) {
    Gson gson = new Gson();
    System.out.println(gson.toJson(obj));
  }


}


