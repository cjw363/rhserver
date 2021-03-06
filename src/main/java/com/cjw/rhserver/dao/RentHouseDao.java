package com.cjw.rhserver.dao;

import com.cjw.rhserver.entity.LoginUser;
import com.cjw.rhserver.entity.system.Page;
import com.cjw.rhserver.utils.ParamData;

import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */
public interface RentHouseDao {
    LoginUser selectUser(ParamData pd);

    LoginUser selectUserByName(ParamData pd);

    int insertUser(ParamData pd);

    List<String> selectSchoolName(ParamData pd);

    ParamData selectSchoolByName(ParamData pd);

    List<ParamData> selectCampusList(Page page);

    int insertRent(ParamData pd);

    List<ParamData> selectCampusListByTime(Page page);

    List<ParamData> selectCampusListByAmountUp(Page page);

    List<ParamData> selectCampusListByAmountDown(Page page);

    List<ParamData> selectBBsList(ParamData pd);

    int insertBBs(ParamData pd);

    List<ParamData> selectMyPublishList(Page page);

    int deleteRent(ParamData pd);

    int updateStatusRent(ParamData pd);
}
