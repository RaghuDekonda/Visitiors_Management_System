package com.visitor.visitors;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "visitors_details")
public class visitorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer visitor_id;
    private String visitor_name;
    private String visiting_room;
    private String visiting_date;
    private String visitor_number;
}
