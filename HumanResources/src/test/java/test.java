import com.iotek.dao.TDepMapper;
import com.iotek.dao.TJobMapper;
import com.iotek.model.TDep;
import com.iotek.model.TJob;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/22
 * Time: 17:14
 * To change this template use File | Settings | File Templates.
 */
public class test {

    @Test
    public void testTJob(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        TJobMapper tJobMapper = (TJobMapper) context.getBean("TJobMapper");

        TJob jobs = tJobMapper.getJobByJid(1);
        System.out.println(jobs);

//        Set<TJob> jobs = tJobMapper.getJobs();
//        for (TJob job : jobs) {
//            System.out.println(job);
//        }

//        TDep tDep = new TDep(1, "部门", new Date());
//        TJob tJob = new TJob(tDep, "职位", new Date());
//        boolean b = tJobMapper.addJob(tJob);
//        System.out.println(b);
//        TJob tJob = new TJob(1, tDep, "hhh", new Date());
//        boolean b = tJobMapper.delJob(tJob);
//        System.out.println(b);

//        TJob tJob = new TJob(1, tDep, "haha", new Date());
//        tJob.setjName("wowo");
//        boolean b = tJobMapper.upJob(tJob);
//        System.out.println(b);

    }

    @Test
    public void testTDEP(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        TDepMapper tDepMapper = (TDepMapper) context.getBean("TDepMapper");

//        TDep tDep = new TDep("LL", new Date());
//        boolean b = tDepMapper.addDEP(tDep);
//        System.out.println(b);

        TDep tDep = new TDep();
//        tDep.setdId(1);
//        boolean b = tDepMapper.delDEP(tDep);
//        System.out.println(b);

//        tDep.setdId(2);
//        tDep.setdName("人事部");
//        boolean b = tDepMapper.upDEP(tDep);
//        System.out.println(b);


//        TDep dep = tDepMapper.getDEPByDid(1);
//        System.out.println(dep);

        List<TDep> deps = tDepMapper.getDeps();
        for (TDep dep : deps) {
            System.out.println(dep);
        }

    }




}
