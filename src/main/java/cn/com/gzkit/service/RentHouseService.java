package cn.com.gzkit.service;

import cn.com.gzkit.entity.LoginUser;
import cn.com.gzkit.entity.system.Page;
import cn.com.gzkit.utils.ParamData;

import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */
public interface RentHouseService {
    LoginUser getUserInfo(ParamData pd);

    int register(ParamData pd);

    List<String> getSchoolName(ParamData pd);

    ParamData getSchoolByName(ParamData pd);

    List<ParamData> getCampusList(Page page);
}
