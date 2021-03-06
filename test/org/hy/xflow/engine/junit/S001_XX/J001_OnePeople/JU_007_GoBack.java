package org.hy.xflow.engine.junit.S001_XX.J001_OnePeople;

import org.hy.common.Help;
import org.hy.xflow.engine.XFlowEngine;
import org.hy.xflow.engine.bean.ActivityRoute;
import org.hy.xflow.engine.bean.NextRoutes;
import org.hy.xflow.engine.bean.User;
import org.hy.xflow.engine.common.BaseJunit;
import org.junit.Test;





/**
 * 测试单元：驳回
 *
 * @author      ZhengWei(HY)
 * @createDate  2018-05-10
 * @version     v1.0
 */
public class JU_007_GoBack extends BaseJunit
{
    
    @Test
    public void test_001()
    {
        User v_Saler = new User();
        v_Saler.setUserID("8a81b2b54b7b391b014b7d12b66400fc");
        v_Saler.setUserName("公用销售人员");
        v_Saler.addRole("004" ,"销售人员");
        
        String v_ServiceDataID = "SID001";
        
        NextRoutes v_NextRoutes = XFlowEngine.getInstance().queryNextRoutesByServiceDataID(v_Saler ,v_ServiceDataID);
        if ( Help.isNull(v_NextRoutes.getRoutes()) )
        {
            System.out.println("-- [" + v_Saler.getUserName()+ "]没有任何可操作的路由");
        }
        else
        {
            ActivityRoute v_Route = v_NextRoutes.getRoutes().get(0);
            
            XFlowEngine.getInstance().toNextByServiceDataID(v_Saler ,v_ServiceDataID ,v_Route.getActivityRouteCode());
            
            System.out.println("-- 选型结果确认未通过转单人选型");
        }
    }
    
}
