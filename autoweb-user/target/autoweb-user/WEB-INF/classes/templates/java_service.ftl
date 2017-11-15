package ${table.packageServiceImpl};

import ${table.packageDomain}.${table.classDomain};

import java.util.List;

/**
* Created by auto build on ${now?string("yyyy/MM/dd")}.
* ${table.tableComment} ${table.classService}
*/
public interface ${table.classService} {

    /**
    * 查询所有${table.tableComment}
    *
    * @return
    */
    List<${table.classDomain}> list${table.classDomain}();

    /**
    * 查询单个${table.tableComment}
    *
    * @param ${table.pk}
    * @return
    */
    ${table.classDomain} get${table.classDomain}(Long ${table.pk});


    /**
    * 修改${table.tableComment}
    *
    * @param ${table.classDomainLower}
    * @return
    */
    int update${table.classDomain}( ${table.classDomain}  ${table.classDomainLower});

    /**
    * 删除${table.tableComment}
    *
    * @param ${table.pk}
    * @return
    */
    int delete${table.classDomain}(Long ${table.pk});

}
