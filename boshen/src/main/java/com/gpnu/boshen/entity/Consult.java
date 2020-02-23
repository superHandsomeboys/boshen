package com.gpnu.boshen.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 咨询
 */
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Consult implements Serializable {

    private Integer consultId;

    private String title;

    private Integer articleId;

    private Integer consultCategoryId;
}