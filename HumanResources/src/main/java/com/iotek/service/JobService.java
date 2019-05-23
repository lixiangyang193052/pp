package com.iotek.service;

import com.iotek.model.TJob;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/23
 * Time: 13:51
 * To change this template use File | Settings | File Templates.
 */
public interface JobService {
    TJob getJobByJid(Integer jid);
    List<TJob> getJobsByDid(Integer did);
    List<TJob> getJobs();
    boolean addJob(TJob tJob);
    boolean delJob(TJob tJob);
    boolean upJob(TJob tJob);
}
