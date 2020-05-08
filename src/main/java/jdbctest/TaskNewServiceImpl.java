package jdbctest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;


@ContextConfiguration(classes =Config.class)
public class TaskNewServiceImpl implements TaskNewService {

    //private static final Logger log = LoggerFactory.getLogger(RelationalDataAccessApplication.class);



    @Autowired
    JdbcTemplate template;

    public TaskNewServiceImpl(JdbcTemplate template){
        System.out.println(template==null);
        this.template=template;
    }


    @Override
    @Transactional
    public String findlatesttask(){
        String sql = "INSERT INTO product VALUES (NULL, ?, ?)";
        try{
           template.update("INSERT INTO product VALUES (? , ?, ?);","4","aaa@qqq.com","gate");
          //  System.out.println(String.valueOf(list.get(0).getId()));
            return "666666666666666666666666666666666666666666666";
        }catch(Exception e){
            e.printStackTrace();
            return "some";
        }
    }
/*
    private static final class TaskNewRowMapper implements RowMapper<TaskNew> {
        public TaskNew mapRow(ResultSet rs, int rowNum)throws SQLException {
            TaskNew taskNew = new TaskNew();
            taskNew.setId(rs.getLong("id"));
            taskNew.setName(rs.getString("name")!=null?rs.getString("name"):"未命名");
            taskNew.setType(rs.getString("type")!=null?rs.getString("type"):"其他");
            taskNew.setVersion(rs.getString("version")!=null?rs.getString("version"):"-");
            taskNew.setUrl(rs.getString("url")!=null?rs.getString("url"):"未发布");
            taskNew.setResult(rs.getString("result")!=null?rs.getString("result"):"未发布");
            taskNew.setCreator(rs.getString("creator")!=null?rs.getString("creator"):"匿名");
            taskNew.setFinishTime(rs.getString("finishTime")!=null?rs.getString("finishTime"):"-");
            taskNew.setDescription(rs.getString("description")!=null?rs.getString("description"):"暂无");
            taskNew.setState(rs.getString("state")!=null?rs.getString("state"):"未知状态");
            taskNew.setFlow(rs.getString("flow")!=null?rs.getString("flow"):"未发布");
            taskNew.setTask_id(rs.getString("task_id")!=null?rs.getString("task_id"):"未发布");
            taskNew.setTask_type(rs.getString("task_type")!=null?rs.getString("task_type"):"未发布");
            taskNew.setParam(rs.getString("param")!=null?rs.getString("param"):"暂无");
            return taskNew;
        }
    }

*/
}