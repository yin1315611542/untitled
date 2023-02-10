package common;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

/**
 * @program: untitled
 * @description:
 * @Author: yinhd
 * @create: 2023-01-28 14:12
 **/
@Data
public class UserVo {
    @JsonProperty("name")
    String name;
    @JsonProperty("age")
    Integer age;
    @JsonProperty("a_pool")
    String aPool;

    @JsonGetter("name")
    public String getName() {
        return name;
    }
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("age")
    public Integer getAge() {
        return age;
    }
    @JsonSetter("age")
    public void setAge(Integer age) {
        this.age = age;
    }
    @JsonGetter("a_pool")
    public String getaPool() {
        return aPool;
    }
    @JsonSetter("a_pool")
    public void setaPool(String aPool) {
        this.aPool = aPool;
    }

//    @Override
//    public String toString() {
//        return "UserVo{" + "name:'" + name + '\'' + ", age:" + age + ", a_pool:'" + aPool + '\'' + '}';
//    }
}
