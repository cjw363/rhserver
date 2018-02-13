package cn.com.gzkit.controller;

import cn.com.gzkit.controller.base.BaseController;
import cn.com.gzkit.entity.system.Page;
import cn.com.gzkit.service.RentHouseService;
import cn.com.gzkit.utils.CommUtil;
import cn.com.gzkit.utils.HandleEnum;
import cn.com.gzkit.utils.ParamData;
import cn.com.gzkit.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/12/26.
 */
@Controller
@RequestMapping("/rh")
@SuppressWarnings({"rawtypes", "unchecked"})
public class RentHouseController extends BaseController {
    @Autowired
    private RentHouseService rentHouseService;

    @ResponseBody
    @RequestMapping("/campusList")
    public ResultData<List<ParamData>> campusList(HttpServletRequest request) {
        try {
            //获取参数
            ParamData pd = this.paramDataInit();
            //初始化分页参数
            int pageCur = CommUtil.paramConvert(pd.getString("pageCur"), 1);//当前页
            int pageSize = CommUtil.paramConvert(pd.getString("pageSize"), 10);//每一页10条数据
            Page page = new Page(pageCur, pageSize, pd);
            List<ParamData> result = rentHouseService.getCampusList(page);

            return new ResultData<List<ParamData>>(HandleEnum.SUCCESS, result);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultData<List<ParamData>>(HandleEnum.FAIL, e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping("/loadFile")
    public void loadFile(HttpServletRequest request, HttpServletResponse response) {
        rentHouseService.loadFile(request, response);
    }

    /**
     * 发布出租
     */
    @ResponseBody
    @RequestMapping("/publishRent")
    public ResultData<ParamData> publishRent
    (@RequestParam("files") CommonsMultipartFile files[], HttpServletRequest request) {
        try {
            boolean isAllUploadSuccess = false;
            ParamData pd = new ParamData();
            pd.put("title", request.getParameter("title"));
            pd.put("content", request.getParameter("content"));
            pd.put("type", request.getParameter("type"));
            pd.put("location", request.getParameter("location"));
            pd.put("longitude", request.getParameter("longitude"));
            pd.put("latitude", request.getParameter("latitude"));
            pd.put("amount", request.getParameter("amount"));
            pd.put("bed", request.getParameter("bed"));
            pd.put("area", request.getParameter("area"));
            pd.put("house_type", request.getParameter("house_type"));
            pd.put("user_id", request.getParameter("user_id"));
            pd.put("label", request.getParameter("label"));
            pd.put("bbs_id", "0");

            String otherImg = "";
            for (int i = 0; i < files.length; i++) {
                String filePath = rentHouseService.uploadFile(files[i]);
                if (filePath != null) {
                    isAllUploadSuccess = true;
                    if (i == 0) {
                        pd.put("title_img", filePath);
                    } else {
                        otherImg += filePath + ",";
                    }
                } else isAllUploadSuccess = false;
            }
            if (otherImg.length() > 0) otherImg = otherImg.substring(0, otherImg.length() - 1);
            pd.put("other_img", otherImg);
            if (isAllUploadSuccess) {
                if (rentHouseService.publishRent(pd) > 0)
                    return new ResultData<ParamData>(HandleEnum.SUCCESS);
            }
            return new ResultData<ParamData>(HandleEnum.FAIL, "上传失败");

        } catch (Exception e) {
            e.printStackTrace();
            return new ResultData<ParamData>(HandleEnum.FAIL, e.getMessage());
        }
    }
}
