package com.finalproject.automated.refactoring.tool.methods.detection.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author M. Reza Pahlevi
 * @version 1.0.0
 * @since 27 April 2019
 */

@Data
@Builder
public class IndexModel {

    private Integer start;

    private Integer end;
}
