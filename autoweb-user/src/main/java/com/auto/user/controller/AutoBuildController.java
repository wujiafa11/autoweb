package com.auto.user.controller;

import com.auto.user.pojo.Table;
import com.auto.user.service.AutoBuildService;
import freemarker.ext.beans.BeansWrapper;
import freemarker.template.Template;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.annotation.Resource;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xc.xiong on 2017/9/30.
 */
@RestController
@RequestMapping("/build")
public class AutoBuildController extends MultiActionController {

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Resource
    private AutoBuildService autoBuildService;

    private String tempDir = "classpath:template";
    private String outDir = "/autoBuild";

    @RequestMapping(value = {"test"}, produces = "application/json;charset=UTF-8")
    public void createJava(String tableName) {
        try {
            Table table = autoBuildService.getTable("diagnosis_disease");
            table.setSubjectModuleName("user");
            Map<String, Object> model = new HashMap<String, Object>();
            model.put("now", new Date());
            model.put("table", table);
            model.put("statics", BeansWrapper.getDefaultInstance().getStaticModels());
            createJavaService(model, table);
            createJavaServiceImpl(model, table);
            createJavaDao(model, table);
            createJavaDaoImpl(model, table);
            createJavaDomain(model, table);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createJavaService(Map<String, Object> model, Table table) {
        writeStringToFile("java_service.ftl", model, table.getPackageService(), table.getClassService());
    }

    public void createJavaServiceImpl(Map<String, Object> model, Table table) {
        writeStringToFile("java_service_impl.ftl", model, table.getPackageServiceImpl(), table.getClassServiceImpl());
    }

    public void createJavaDao(Map<String, Object> model, Table table) {
        writeStringToFile("java_dao.ftl", model, table.getPackageDao(), table.getClassDao());
    }

    public void createJavaDaoImpl(Map<String, Object> model, Table table) {
        writeStringToFile("java_dao_impl.ftl", model, table.getPackageDaoImpl(), table.getClassDaoImpl());
    }
    public void createJavaDomain(Map<String, Object> model, Table table) {
        writeStringToFile("java_domain.ftl", model, table.getPackageDomain(), table.getClassDomain());
    }

    public void writeStringToFile(String templateName, Map<String, Object> model, String packageName, String className) {
        try {
            Template template = freeMarkerConfigurer.getConfiguration().getTemplate(templateName, "utf-8");
            String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
            String dir = System.getProperty("user.dir") + "/target/autoBuild/src/" + packageName.replaceAll("\\.", "/") + "/" + className + ".java";
            File file = new File(dir);
            FileUtils.writeStringToFile(file, content, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
