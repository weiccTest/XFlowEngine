package org.hy.xflow.engine.service;

import org.hy.xflow.engine.bean.FlowInfo;
import org.hy.xflow.engine.bean.FlowProcess;





/**
 * 工作流实例的服务层接口
 *
 * @author      ZhengWei(HY)
 * @createDate  2018-04-25
 * @version     v1.0
 */
public interface IFlowInfoService
{
    
    /**
     * 工作流实例ID，查询工作流实例
     * 
     * @author      ZhengWei(HY)
     * @createDate  2018-04-27
     * @version     v1.0
     *
     * @param i_WorkID  工作流实例ID
     * @return
     */
    public FlowInfo queryByWorkID(String i_WorkID);
    
    
    
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
    public FlowInfo queryByServiceDataID(String i_ServiceDataID);
    
    
    
    /**
     * 创建的工作流实例，当前活动节点为  "开始" 节点。
     * 
     * @author      ZhengWei(HY)
     * @createDate  2018-04-26
     * @version     v1.0
     *
     * @param i_FlowInfo
     * @param i_Process
     * @return
     */
    public boolean createFlow(FlowInfo i_FlowInfo ,FlowProcess i_Process);
    
    
    
    /**
     * 工作流流转，并更新前一个流转信息。
     * 
     * @author      ZhengWei(HY)
     * @createDate  2018-05-07
     * @version     v1.0
     *
     * @param i_Process   新流转的过程信息
     * @param i_Previous  前一个流转的过程信息
     * @return
     */
    public boolean toNext(FlowProcess i_Process ,FlowProcess i_Previous);
    
    
    
    /**
     * 工作流实例ID，全流转结束后转历史
     * 
     * @author      ZhengWei(HY)
     * @createDate  2018-05-11
     * @version     v1.0
     *
     * @param i_WorkID  工作流实例ID
     * @return
     */
    public boolean toHistory(String i_WorkID);
    
    
    
    /**
     * 按第三方使用系统的业务数据ID，全流转结束后转历史
     * 
     * @author      ZhengWei(HY)
     * @createDate  2018-05-11
     * @version     v1.0
     *
     * @param i_ServiceDataID  第三方使用系统的业务数据ID。即支持用第三方ID也能找到工作流信息
     * @return
     */
    public boolean toHistoryByServiceDataID(String i_ServiceDataID);
    
}
