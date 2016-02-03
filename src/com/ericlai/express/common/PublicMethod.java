package com.ericlai.express.common;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2016/2/2.
 */
public class PublicMethod {

    /**
     * 将json格式的数据返回前端
     * @param response
     * @param json json格式数据
     */
    public static void SendJsonToFront(HttpServletResponse response, String json) {
        PrintWriter out = null;
        //设置格式
        response.setContentType("application/json");
        try {
            //获取输出的格式
            out = response.getWriter();
            //输出json格式的字符串到前端
            out.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
