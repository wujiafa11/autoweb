package ${table.packageDomain};

import org.codehaus.jackson.annotate.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
* Created by auto build on ${now?string("yyyy/MM/dd")}.
* ${table.tableComment} ${table.classDomain}
*/
@Entity
@Table(name = "${table.tableName}")
public class ${table.classDomain} implements Serializable{

  <#list table.columnList as item>
    /**
    * ${item.columnComment}
    */
    <#if item.columnKey='PRI'>
    @Id
    </#if>
    @Column(name = "${item.columnName}")
    private ${item.dataType} ${item.fieldName};<#--${item.columnComment}-->

  </#list>

    /**
     * ${table.tableComment}对象构造函数
     */
    public ${table.classDomain}() {
    }

  <#list table.columnList as item>

    public ${item.dataType} get${item.fieldName?cap_first}(){
        return this.${item.fieldName};
    }

    public void set${item.fieldName?cap_first}(${item.dataType} ${item.fieldName}){
        this.${item.fieldName} = ${item.fieldName};
    }
  </#list>
}