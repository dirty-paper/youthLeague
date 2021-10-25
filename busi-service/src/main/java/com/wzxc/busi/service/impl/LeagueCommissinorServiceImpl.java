package com.wzxc.busi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wzxc.common.core.text.Convert;
import com.wzxc.common.utils.DateUtils;
import com.wzxc.busi.dao.ds1.LeagueCommissinorMapper;
import com.wzxc.busi.vo.LeagueCommissinor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wzxc.busi.service.ILeagueCommissinorService;

import java.util.List;

/**
 * <p>
 * 服务实现类 【请填写功能名称】
 * </p>
 *
 * @author MUHAMUHA
 * @date 2021-10-20
 */
@Service
public class LeagueCommissinorServiceImpl extends ServiceImpl<LeagueCommissinorMapper, LeagueCommissinor> implements ILeagueCommissinorService {

    @Autowired
    private LeagueCommissinorMapper leagueCommissinorMapper;

    /**
     * 查询【请填写功能名称】列表
     *
     * @param leagueCommissinor 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LeagueCommissinor> selectLeagueCommissinorList(LeagueCommissinor leagueCommissinor) {
        return leagueCommissinorMapper.selectLeagueCommissinorList(leagueCommissinor);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param leagueCommissinor 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLeagueCommissinor(LeagueCommissinor leagueCommissinor) {
        return leagueCommissinorMapper.insertLeagueCommissinor(leagueCommissinor);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param leagueCommissinor 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLeagueCommissinor(LeagueCommissinor leagueCommissinor) {
        return leagueCommissinorMapper.updateLeagueCommissinor(leagueCommissinor);
    }



}