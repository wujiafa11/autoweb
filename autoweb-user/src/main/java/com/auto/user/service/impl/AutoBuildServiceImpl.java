package com.auto.user.service.impl;

import com.auto.user.dao.AutoBuildDao;
import com.auto.user.pojo.Column;
import com.auto.user.pojo.Table;
import com.auto.user.service.AutoBuildService;
import freemarker.ext.beans.BeansWrapper;
import freemarker.template.Template;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.annotation.Resource;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xc.xiong on 2017/9/5.
 *
 */
@Service
@Transactional
public class AutoBuildServiceImpl implements AutoBuildService {

    @Resource
    private AutoBuildDao autoBuildDao;


    public Table getTable(String tableName){
        try {
            Table table = autoBuildDao.getTable(tableName);
            List<Column> columns = autoBuildDao.listColumn(tableName);
            table.setColumnList(columns);
            return table;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
