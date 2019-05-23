package com.iotek.service.impl;

import com.iotek.dao.TJobMapper;
import com.iotek.model.TJob;
import com.iotek.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/23
 * Time: 13:53
 * To change this template use File | Settings | File Templates.
 */
@Service
public class JobServiceImpl implements JobService {
    @Resource
    private TJobMapper tJobMapper;
    public TJob getJobByJid(Integer jid) {
        if (jid!=null){
            return tJobMapper.getJobByJid(jid);
        }
        return null;
    }

    public List<TJob> getJobsByDid(Integer did) {
        if (did!=null){
            return tJobMapper.getJobsByDid(did);
        }
        return null;
    }

    public List<TJob> getJobs() {
        return tJobMapper.getJobs();
    }

    public boolean addJob(TJob tJob) {
        if (tJob!=null){
            return tJobMapper.addJob(tJob);
        }
        return false;
    }

    public boolean delJob(TJob tJob) {
        if (tJob!=null){
            return tJobMapper.delJob(tJob);
        }
        return false;
    }

    public boolean upJob(TJob tJob) {
        if (tJob!=null){
            return tJobMapper.upJob(tJob);
        }
        return false;
    }
}
