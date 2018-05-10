package org.hy.xflow.engine.junit.S001_XX.J001_OnePeople;

import java.util.List;

import org.hy.common.Help;
import org.hy.xflow.engine.XFlowEngine;
import org.hy.xflow.engine.bean.ActivityRoute;
import org.hy.xflow.engine.bean.User;
import org.hy.xflow.engine.common.BaseJunit;
import org.junit.Test;





/**
 * 测试单元：动态参与人的活动向下一活动流转 
 *
 * @author      ZhengWei(HY)
 * @createDate  2018-05-09
 * @version     v1.0
 */
public class JU_006_ParticipantsToNext extends BaseJunit
{
    
    @Test
    public void test001()
    {
        User v_User  = new User();
        v_User.setUserID("8a81b2b54b7b391b014b7d143a7400fe");
        v_User.setUserName("公用选型负责人");
        v_User.addRole("002" ,"选型负责人");
        
        String v_ServiceDataID = "SID001";
        
        List<ActivityRoute> v_Routes = XFlowEngine.getInstance().queryNextRoutesByServiceDataID(v_User ,v_ServiceDataID);
        if ( Help.isNull(v_Routes) )
        {
            System.out.println("-- [" + v_User.getUserName()+ "]没有任何可操作的路由");
        }
        else
        {
            ActivityRoute v_Route = v_Routes.get(0);
            
            XFlowEngine.getInstance().toNextByServiceDataID(v_User ,v_ServiceDataID ,v_Route.getActivityID() ,v_Route.getActivityRouteID());
            
            System.out.println("-- 转评审成功");
        }
    }
    
}