package jdbctest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.io.IOException;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class test {
    @Autowired
    private TaskNewService task;


    @Test
    public void test001() throws IOException {
        assertNotNull(task);
        task.findlatesttask();
        //System.out.println(task==null);
        //r.test();
    }
}
