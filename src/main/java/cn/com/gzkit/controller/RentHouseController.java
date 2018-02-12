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
import java.io.*;
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
    public void loadFile(HttpServletRequest request,HttpServletResponse response){
        BufferedInputStream bis = null;
        BufferedOutputStream fos = null;
        try {
            String filePath = request.getParameter("filePath");
            String uploadType = request.getParameter("uploadType");
            File file = new File(filePath);

            bis = new BufferedInputStream(new FileInputStream(file));
            fos = new BufferedOutputStream(response.getOutputStream());

            String[] split1 = filePath.split("/");
            String fileName=split1[split1.length-1];

            response.setContentType(uploadType);
            response.setHeader("Cache-Control","no-cache,must-revalidate");//告诉浏览器当前页面不进行缓存，每次访问的时间必须从服务器上读取最新的数据
            response.setContentLength(bis.available());
            response.setHeader("Content-Disposition", "inline; filename=\"" + fileName + "\"" );

            byte[] buffer = new byte[1024];
            int length;
            while ((length = bis.read(buffer)) > 0 ) {
                fos.write(buffer, 0, length);
            }
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if(bis!=null)
                    bis.close();
                if(fos!=null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 发布出租
     */
    @ResponseBody
    @RequestMapping("/publishRent")
    public ResultData<ParamData> publishRent
    (@RequestParam("files") CommonsMultipartFile files[], HttpServletRequest request) {
        try {
//            String name = request.getParameter("name");
            //初始化分页参数
            for(CommonsMultipartFile file:files){
                System.out.println(file.getOriginalFilename());
            }
            return new ResultData<ParamData>(HandleEnum.SUCCESS, "");
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultData<ParamData>(HandleEnum.FAIL, e.getMessage());
        }
    }
}
