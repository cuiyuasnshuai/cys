package com.ruoyi.userinfo.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.userinfo.domain.CysUserinfo;
import com.ruoyi.userinfo.service.ICysUserinfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户Controller
 * 
 * @author ruoyi
 * @date 2024-05-07
 */
@RestController
@RequestMapping("/userinfo/userinfo")
public class CysUserinfoController extends BaseController
{
    @Autowired
    private ICysUserinfoService cysUserinfoService;

    /**
     * 查询用户列表
     */
    @PreAuthorize("@ss.hasPermi('userinfo:userinfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(CysUserinfo cysUserinfo)
    {
        startPage();
        List<CysUserinfo> list = cysUserinfoService.selectCysUserinfoList(cysUserinfo);
        return getDataTable(list);
    }

    /**
     * 导出用户列表
     */
    @PreAuthorize("@ss.hasPermi('userinfo:userinfo:export')")
    @Log(title = "用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CysUserinfo cysUserinfo)
    {
        List<CysUserinfo> list = cysUserinfoService.selectCysUserinfoList(cysUserinfo);
        ExcelUtil<CysUserinfo> util = new ExcelUtil<CysUserinfo>(CysUserinfo.class);
        util.exportExcel(response, list, "用户数据");
    }

    /**
     * 获取用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('userinfo:userinfo:query')")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") Long userId)
    {
        return success(cysUserinfoService.selectCysUserinfoByUserId(userId));
    }

    /**
     * 新增用户
     */
    @PreAuthorize("@ss.hasPermi('userinfo:userinfo:add')")
    @Log(title = "用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CysUserinfo cysUserinfo)
    {
        return toAjax(cysUserinfoService.insertCysUserinfo(cysUserinfo));
    }

    /**
     * 修改用户
     */
    @PreAuthorize("@ss.hasPermi('userinfo:userinfo:edit')")
    @Log(title = "用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CysUserinfo cysUserinfo)
    {
        return toAjax(cysUserinfoService.updateCysUserinfo(cysUserinfo));
    }

    /**
     * 删除用户
     */
    @PreAuthorize("@ss.hasPermi('userinfo:userinfo:remove')")
    @Log(title = "用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{userIds}")
    public AjaxResult remove(@PathVariable Long[] userIds)
    {
        return toAjax(cysUserinfoService.deleteCysUserinfoByUserIds(userIds));
    }
}
