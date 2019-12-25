package com.fc.util;


public class MyConstant {
    //七牛云相关
    public static final String QINIU_IMAGE_URL = "http://od6v5lenq.bkt.clouddn.com/";
    public static final String QINIU_ACCESS_KEY = "OO_3P93p4-feCji_Vd3SQPA4FtrUpjw8bL1jXhF8";
    public static final String QINIU_SECRET_KEY = "AXdJXoYtGL42K_w7UzaNxhrNU55K_XEkv-Zgte1w";
    public static final String QINIU_BUCKET_NAME = "excited";

    //发送邮件的邮箱，要与df.properties中的一致
    public static final String MAIL_FROM = "ceshihahu@yeah.net";

    //域名
    
    public static final String DOMAIN_NAME = "http://naivee.me/";

    //三种操作
    public static final int OPERATION_CLICK_LIKE = 1;
    public static final int OPERATION_REPLY = 2;
    public static final int OPERATION_COMMENT = 3;
    
if (request.getParameter("pageNO") == null)
                           pageNO = 0;
                    else
                           pageNO = Integer.parseInt(request.getParameter("pageNO"));
                    lastPage = (int) Math.ceil((double) count / MaxNum);
                    if (pageNO == 0)
                           pageNO = 1;
                    if (pageNO > lastPage)
                           pageNO = lastPage;
                    firstNum = (pageNO - 1) * MaxNum + 1;
                    lastNum = pageNO * MaxNum;
                    if (pageNO == 1)
                           prePage = 1;
                    else
                           prePage = pageNO - 1;
                    if (pageNO == lastPage)
                           nextPage = pageNO;
                    else
                           nextPage = pageNO + 1;
                    sql = "select * from discuss where id between " + firstNum
                                  + " and " + lastNum;
                    rs = stm.executeQuery(sql);

}
