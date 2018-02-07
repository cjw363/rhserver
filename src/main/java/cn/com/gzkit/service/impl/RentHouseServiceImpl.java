package cn.com.gzkit.service.impl;

import cn.com.gzkit.dao.RentHouseDao;
import cn.com.gzkit.entity.LoginUser;
import cn.com.gzkit.entity.system.Page;
import cn.com.gzkit.service.RentHouseService;
import cn.com.gzkit.utils.ParamData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */
@Service
public class RentHouseServiceImpl implements RentHouseService {
    @Resource
    private RentHouseDao rentHouseDao;

    @Override
    public LoginUser getUserInfo(ParamData pd) {
        return rentHouseDao.selectUser(pd);
    }

    @Override
    public int register(ParamData pd) {
        LoginUser userInfo = rentHouseDao.selectUserByName(pd);
        if(userInfo!=null){
            return 0;//已存在
        }else {
            return rentHouseDao.insertUser(pd);
        }
    }

    @Override
    public List<String> getSchoolName(ParamData pd) {
        return rentHouseDao.selectSchoolName(pd);
    }

    @Override
    public ParamData getSchoolByName(ParamData pd) {
        return rentHouseDao.selectSchoolByName(pd);
    }

    @Override
    public List<ParamData> getCampusList(Page page) {
        return rentHouseDao.selectCampusList(page);
    }
}
