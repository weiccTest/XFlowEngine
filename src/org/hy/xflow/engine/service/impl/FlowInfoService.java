package org.hy.xflow.engine.service.impl;

import org.hy.common.xml.annotation.Xjava;
import org.hy.xflow.engine.bean.FlowInfo;
import org.hy.xflow.engine.common.BaseService;
import org.hy.xflow.engine.dao.IFlowInfoDAO;
import org.hy.xflow.engine.service.IFlowInfoService;





/**
 * 工作流模板的服务层
 *
 * @author      ZhengWei(HY)
 * @createDate  2018-04-25
 * @version     v1.0
 */
@Xjava
public class FlowInfoService extends BaseService implements IFlowInfoService
{
    
    @Xjava
    private IFlowInfoDAO flowInfoDAO;
    
    
    
    /**
     * 按第三方使用系统的业务数据ID，查询工作流实例
     * 
     * @author      ZhengWei(HY)
     * @createDate  2018-04-25
     * @version     v1.0
     *
     * @param i_ServiceDataID  第三方使用系统的业务数据ID。即支持用第三方ID也能找到工作流信息
     * @return
     */
    public FlowInfo queryByServiceDataID(String i_ServiceDataID)
    {
        return this.flowInfoDAO.queryByServiceDataID(i_ServiceDataID);
    }
    
}