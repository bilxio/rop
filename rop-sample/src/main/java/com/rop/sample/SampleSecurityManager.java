/**
 * 版权声明：中图一购网络科技有限公司 版权所有 违者必究 2012 
 * 日    期：12-5-25
 */
package com.rop.sample;

import com.rop.RopServiceContext;
import com.rop.SecurityManager;
/**
 * <pre>
 * 功能说明：
 * </pre>
 *
 * @author 陈雄华
 * @version 1.0
 */
public class SampleSecurityManager implements SecurityManager{
    @Override
    public boolean isGranted(RopServiceContext context) {
        System.out.println("use SampleSecurityManager!");
        return true;
    }
}

