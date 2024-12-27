package com.visitor.visitors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Visitor {

    private Integer visitor_id;
    private String visitor_name;
    private String visiting_room;
    private String visiting_date;
    private String visitor_number;

}
