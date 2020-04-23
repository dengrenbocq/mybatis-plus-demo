package com.dr.mybatisplusdemo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author jobob
 * @since 2020-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Myuser implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId
    private int myId;

    private String username;

    private String passwd;

    private Integer userAge;


}
