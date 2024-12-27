package com.visitor.visitors;

import java.util.List;

public interface visitorservice {
    String createVisitor(Visitor visitor);

    List<Visitor> readVisitors();

    boolean deleteVisitor(Integer visiter_id);

    String updateVisitor(int id, Visitor visitor);

  //  Visitor getVisitorByName(String visitor_name);
}
