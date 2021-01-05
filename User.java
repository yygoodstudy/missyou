
package com.yy.ymissyou.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

/**
 * @Date: 2021/1/4 22:53
 * @Description:
 */
@Getter
@Setter
@ToString
public class User {

    @Length(min = 2,max = 20,message = "长度应该介于2和20之间")
    private String schoolName;

}
