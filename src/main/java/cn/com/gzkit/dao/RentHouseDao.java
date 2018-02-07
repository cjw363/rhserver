package cn.com.gzkit.dao;

import cn.com.gzkit.entity.LoginUser;
import cn.com.gzkit.entity.system.Page;
import cn.com.gzkit.utils.ParamData;

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
}
