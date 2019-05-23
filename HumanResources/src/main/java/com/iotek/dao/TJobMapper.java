package com.iotek.dao;

import com.iotek.model.TJob;

import java.util.List;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: Dbbbyt
 * Date: 2019/5/22
 * Time: 16:39
 * To change this template use File | Settings | File Templates.
 */
public interface TJobMapper {
    TJob getJobByJid(Integer jid);
    List<TJob> getJobsByDid(Integer did);
    List<TJob> getJobs();
    boolean addJob(TJob tJob);
    boolean delJob(TJob tJob);
    boolean upJob(TJob tJob);
}
